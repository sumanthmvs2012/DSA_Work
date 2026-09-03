package Day_10;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumInterval_1851
{
    public static void main(String[] args)
    {
        MiniIntervalQuery miniIntervalQuery = new MiniIntervalQuery();
        int[][] intervals = {{1,4},{2,4},{3,6},{4,4}};
        //int[][] intervals = {{2,3},{2,5},{1,8},{20,25}};
        // int[] queries = {2,19,5,22};
        int[] queries = {2,3,4,5};
        //Output: [3,3,1,4]
        int[] result = miniIntervalQuery.newArray(intervals,queries);
        System.out.println("Result: " + Arrays.toString(result));
    }

}

class MiniIntervalQuery
{
    public int[] newArray(int[][] intervals,int[] queries)
    {
        int interLen = intervals.length;
        int querLen = queries.length;
        int ind =0;

        int[][] indexQuer = new int[querLen][2];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println("sorted_interval: " + Arrays.deepToString(intervals)); // [[1, 8], [2, 3], [2, 5], [20, 25]]

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        for(int i=0;i<querLen;i++)
        {
            indexQuer[i][0] = queries[i];
            indexQuer[i][1] = i;
        }
        System.out.println("index_query: " + Arrays.deepToString(indexQuer)); //[[2, 0], [19, 1], [5, 2], [22, 3]]
        Arrays.sort(indexQuer, (a, b) -> a[0] - b[0]);
        System.out.println("sorting_index_query: " + Arrays.deepToString(indexQuer)); // [[2, 0], [5, 2], [19, 1], [22, 3]]

        int[] ans = new int[querLen]; // final answer

        for(int i = 0;i < querLen;i++)
        {
            int val = indexQuer[i][0];
            while (ind < interLen && intervals[ind][0] <= val)
            {
                pq.offer(new int[]{intervals[ind][0], intervals[ind][1], intervals[ind][1] - intervals[ind][0] + 1});
                ind++;
            }

            while(!pq.isEmpty() && pq.peek()[1] < val) pq.poll();

            ans[indexQuer[i][1]] = pq.isEmpty() ? -1 : pq.peek()[2];
        }
        for (int[] arr : pq) {
            System.out.println("pq: " + Arrays.toString(arr)); //pq: [20, 25, 6]
        }
        return ans;
    }
}