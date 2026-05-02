package day1_DSA;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum_hashmap
{
    public static void main(String[] args)
    {
        // hashmap
        twosum_logic_hashmap tl = new twosum_logic_hashmap();
        int[] res = tl.logic(9);
        System.out.println("Arr:- " + Arrays.toString(res));
    }
}

class twosum_logic_hashmap
{
    public int[] logic(int target)
    {
        int[] nums = new int[]{2, 11, 7, 15};
        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hp.containsKey(target - nums[i]))
            {
                System.out.println("first:- " + nums[i]);
                System.out.println("second:- " + (target - nums[i]));
                return new int[]{hp.get(target - nums[i]), i};
            }
            hp.put(nums[i], i);
        }
        return null;
    }
}
