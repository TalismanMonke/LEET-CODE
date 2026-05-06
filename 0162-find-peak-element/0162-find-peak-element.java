class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        // Use left < right to find the convergence point
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Are we on an upward slope?
            if (nums[mid] < nums[mid + 1]) {
                // Yes, so the peak is to the right
                left = mid + 1;
            } else {
                // No, we are on a downward slope or at a peak
                // The peak is at mid or to the left
                right = mid;
            }
        }
        
        // When left == right, they point to a peak element
        return left;
    }
}
