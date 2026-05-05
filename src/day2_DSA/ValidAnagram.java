package day2_DSA;

import java.util.Hashtable;

public class ValidAnagram
{
    public static void main(String[] args)
    {
       ValidAnagram vd = new ValidAnagram();
       boolean val = vd.isAnagram("anagram", "nagaram");
        System.out.println("Result:- " + val);
    }

    public boolean isAnagram(String s1, String t1)
    {

      if(s1.length() != t1.length())
      {
          return false;
      }

      Hashtable<Character, Integer> hs1 = new Hashtable<>();
      Hashtable<Character, Integer> hs2 = new Hashtable<>();
      for(int i=0;i<s1.length();i++)
      {
        char ch1 = s1.charAt(i);
        hs1.put(ch1, hs1.getOrDefault(ch1,0) + 1);

      }

      for(int i=0;i<t1.length();i++)
      {
          char ch1 = t1.charAt(i);
          hs2.put(ch1, hs2.getOrDefault(ch1,0) + 1);

      }

      System.out.println("hs1:- " + hs1);
      System.out.println("hs2:- " + hs2);


     return hs1.equals(hs2);
    }
}
