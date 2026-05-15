package Day3_DSA;

import java.util.HashSet;

public class Longest_Consecutive_Sequence
{
    public static void main(String[] args)
    {
       Longest_Consecutive_Sequence lcs = new Longest_Consecutive_Sequence();
       int[] nums = {100,4,200,1,3,2};

       int result  = lcs.longest_seq(nums);
       System.out.println("Result for Longest_Consecutive_Sequence:- " + result);
    }

    public int longest_seq(int[] nums)
    {
        HashSet<Integer> hs = new HashSet<>();
        int current=0;
        //int presentNumber = 0;
        int result = 0;

        // added to hashset
        for(int i:nums)
        {
            hs.add(i);
        }

        for(int i: hs)
        {
            if (!hs.contains(i - 1))
            {
                int presentNumber = i;
                current = 1;

                while (hs.contains(presentNumber + 1))
                {
                    presentNumber = presentNumber + 1;
                    current++;
                }
               result = Math.max(current, result);
            }
        }
        System.out.println("Result:- " + result);
        return result;
    }
}
