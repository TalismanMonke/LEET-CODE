class Solution {
    public int numRescueBoats(int[] people, int limit) {
     int boat=0;
     Arrays.sort(people);
     int left =0;
     int right=people.length-1;
     while(left <= right){
        int sum = people[left]+people[right];
        if(sum<=limit)
        {
            boat++;
            left++;
            right--;
        }else{
            boat++;
            right--;
        }
     }
     return boat;
    

    }
    }
