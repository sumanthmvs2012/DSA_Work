package day1_DSA;

import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args)
    {
        // array basics
        twosum_logic tl = new twosum_logic();
        int[] res = tl.logic(9);
        System.out.println("Arr:- " + Arrays.toString(res));
    }
}

class twosum_logic
{
    public int[] logic(int target)
    {
        int[] nums = new int[]{2, 7, 11, 15};
        //target = 9;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(target == (nums[i] + nums[j]))
                {
                    System.out.println("res:" + nums[i] +","+  nums[j]);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
