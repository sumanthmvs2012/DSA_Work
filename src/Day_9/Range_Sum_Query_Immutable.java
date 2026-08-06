package Day_9;

public class Range_Sum_Query_Immutable
{
    public static void main(String[] args)
    {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));

    }
}

class NumArray
{
    private final int[] prefixSum;
    public NumArray(int[] nums)
    {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
        {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

    }

    public int sumRange(int left, int right)
    {
        return prefixSum[right + 1] - prefixSum[left];
    }
}



