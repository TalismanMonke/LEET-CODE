import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals based on starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Add first interval
        merged.add(intervals[0]);

        // Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] current = intervals[i];

            // Check overlap
            if (current[0] <= last[1]) {
                // Merge intervals
                last[1] = Math.max(last[1], current[1]);
            } else {
                // No overlap → add new interval
                merged.add(current);
            }
        }

        // Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}