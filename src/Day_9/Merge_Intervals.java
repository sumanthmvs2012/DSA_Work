package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals
{
    public static void main(String[] args)
    {
        Merge_results mergeResults = new Merge_results();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //Output: {{1,6},{8,10},{15,18}}
        int[][] result = mergeResults.merge(intervals);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}

class Merge_results
{
    public int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // Overlap condition: current start <= previous end
            if (intervals[i][0] <= prev[1]) {
                // Merge intervals
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                // No overlap, add previous interval to result
                merged.add(prev);
                prev = intervals[i];
            }
        }

        merged.add(prev); // Add the last interval
        return merged.toArray(new int[merged.size()][]);
    }
      //return new int[0][0];
}
