package Day3_DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Product_Array_Except_Self {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};

        Product_Array_Except_Self paes = new Product_Array_Except_Self();
        int[] res = paes.LogicFrequentElement(nums);
        System.out.println("Result:- " + Arrays.toString(res));

    }

    public int[] LogicFrequentElement(int[] nums)
    {
        int n = nums.length;
        int[] fin= new int[n];
        int prefix = 1;

        //Prefix product
       for(int i=0 ;i<n; i++)
       {
           fin[i] = prefix;
           prefix = prefix * nums[i];
       }
       System.out.println("prefix:- " + Arrays.toString(fin));

       //suffix and result
        int suffix =1;
       for(int i=n-1; i>= 0 ;i--)
       {
           fin[i] = fin[i] * suffix;
           suffix = suffix * nums[i];
       }
        System.out.println("suffix:- " + Arrays.toString(fin));

        return fin;
    }
}
