package day2_DSA;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Top_K_FrequentElements
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Top_K_FrequentElements tp = new Top_K_FrequentElements();
        int[] res = tp.LogicFrequentElement(nums, k);
        System.out.println("Result:- " + Arrays.toString(res));
    }

    public int[] LogicFrequentElement(int[] nums, int k)
    {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int[] tops;

        for(int i:nums)
        {
            hp.put(i, hp.getOrDefault(i, 0)+1);
        }
        System.out.println("hashmap:- " + hp);

        // Min Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : hp.entrySet())
        {
            pq.add(entry);

            if(pq.size() > k)
            {
                pq.poll(); // remove smallest
            }
        }

        int[] result = new int[k];
        int i = 0;

        while(!pq.isEmpty())
        {
            result[i++] = pq.poll().getKey();
        }
        return result;
    }

}
