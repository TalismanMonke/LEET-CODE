class Solution {
    private boolean canShip(int[] weights, int capacity,  int days){
        int currWeight  = 0;
        int requiredDays = 1;
        for(int weight : weights){
            
            if(currWeight + weight > capacity){
                requiredDays++;
                currWeight = 0;
            }
            currWeight  += weight;
        }

        return requiredDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        //the max element in that list is the minimum possible weight we required to ship one package in one day
        //and the summation of all the list element that is the max capacity in which we can ship everthing in one day

        int high = 0;
        int low = 0;
        
        for(int i = 0; i<weights.length; i++){
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        if(days == 1) return high;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canShip(weights, mid, days)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
       
    }
}