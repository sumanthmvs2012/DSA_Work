package day2_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams
{
    public static void main(String[] args)
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat", "tab", "ant"};
        GroupAnagrams ga = new GroupAnagrams();

        List<List<String>> lstr = ga.groupAnagrams(strs);
        System.out.println("Result:- " + lstr);
    }

    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String, List<String>> lstr = new HashMap<>();
        for(String s : strs)
        {
            char[] ch1 = s.toCharArray();
            Arrays.sort(ch1);
            String sorted = new String(ch1);

            if(!lstr.containsKey(sorted))
            {
                lstr.put(sorted, new ArrayList<>());
            }
            lstr.get(sorted).add(s);
        }
      return new ArrayList<>(lstr.values());
    }
}
