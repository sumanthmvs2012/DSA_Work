package Day4_DSA;   // Two Sum II - Input Array Is Sorted
                    // no for loops

import java.util.HashMap;
import java.util.HashSet;

public class Two_Sum_II
{
    public static void main(String[] args)
    {
        Two_Sum_II tst = new Two_Sum_II();
        int target = 9;
        int[] nums = {2,7,11,15};

        int[] result  = tst.two_sum_sorted(nums, target);
        System.out.println("Result for two_sum_sorted:- " + result);
    }

    public int[] two_sum_sorted(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            int sum = nums[start] + nums[end];

            if(sum == target)
            {
                return new int[]{start + 1, end + 1};
            }
            else if(sum < target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
