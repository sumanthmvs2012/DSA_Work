package day1_DSA;

import java.util.HashSet;

public class ContainsDuplicate
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 1, 4};

        HashSet<Integer> seen = new HashSet<>();
        for(int i : nums)
        {
            if(seen.contains(i))
            {
                System.out.println("true");
            }
            else
            {
                seen.add(i);
            }
        }
        System.out.println("false");

    }
}
