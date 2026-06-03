package Day4_DSA;

import java.util.List;

public class Sum3
{
    public static void main(String[] args)
    {
        Sum3 tst = new Sum3();

        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result  = tst.three_sum(nums);
        System.out.println("Result for three_sum- " + result);
    }

    public List<List<Integer>> three_sum(int[] nums)
    {
        int target = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {

                if((target+nums[i] + nums[j]) == 0)
                {
                    System.out.println("res:" + nums[i] +","+  nums[j]);
                    //return new int[]{i,j};
                }

            }
        }

        return null;
    }
}
