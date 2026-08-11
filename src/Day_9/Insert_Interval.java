package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Insert_Interval
{
  public static void main(String[] args)
  {
      int[][] intervals = {{1, 3}, {6,9}};
      int[] newInterval = {2,5};
      // Excepted output: [[1, 5], [6, 9]]
      Solution sol = new Solution();
      int[][] result = sol.insert(intervals, newInterval);
      System.out.println("Result: " + Arrays.deepToString(result));

  }
}

class Solution
{
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        // 1. LEFT (non-overlapping)
        while (i < n && intervals[i][1] < newStart) {
            res.add(intervals[i]);
            i++;
        }

        // 2. MERGE (overlapping)
        while (i < n && intervals[i][0] <= newEnd) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd, intervals[i][1]);
            i++;
        }
        res.add(new int[]{newStart, newEnd});

        // 3. RIGHT (remaining)
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
