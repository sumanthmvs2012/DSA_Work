package Day_10;

import java.util.Arrays;

public class NonOverlappingIntervals
{
    public static void main(String[] args)
    {
        eraseOverlapIntervals eraseOverlapIntervals = new eraseOverlapIntervals();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        //Output: 1
        int result = eraseOverlapIntervals.merge(intervals);
        System.out.println("Result: " + result);
    }
}

class eraseOverlapIntervals {
    public int merge(int[][] intervals)
    {

        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println("intervals: " + Arrays.deepToString(intervals));

        int prev = 0;
        int count = 1;

        for (int i = 1; i < n; i++)
        {
            if (intervals[i][0] >= intervals[prev][1])
            {
                prev = i;
                count++;
                //changes
            }
        }
        return n - count;
    }

}
