package Day5_DSA_TwoPointers;

public class Trapping_Rain_Water
{
    public static void main(String[] args)
    {
        Trapping_Rain_Water trw = new Trapping_Rain_Water();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trw.trap(height);
        System.out.println("Result for Trapping_Rain_Water:- " + result);
    }

    public int trap(int[] height)
    {
        int len = height.length;
        if(len == 0) return 0;

        //intinalize
        int[] left = new int[len];
        int[] right  = new int[len];

        //intiate the size
        left[0] = height[0];
        right[len-1] = height[len-1];

        for(int i=1;i<len;i++)
        {
            left[i] = Math.max(left[i-1],height[i]);
        }

        for(int j=len-2;j>=0;j--)
        {
           right[j] = Math.max(right[j+1], height[j]);
        }


        int trapwater = 0;
        for(int k=1;k<len;k++)
        {
            trapwater += Math.min(left[k], right[k]) - height[k];
        }
        return trapwater;
    }
}
