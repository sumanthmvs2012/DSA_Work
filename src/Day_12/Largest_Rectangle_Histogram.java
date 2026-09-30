package Day_12;

public class Largest_Rectangle_Histogram
{
    public static void main(String[] args)
    {
        int[] heights = {2,1,5,6,2,3};

        Sol_largest_Rectangle_Histogram solLargestRectangleHistogram = new Sol_largest_Rectangle_Histogram();
        int result = solLargestRectangleHistogram.input_Rectangle_Histogram(heights);

        System.out.println("Result:" + result);
    }
}

class Sol_largest_Rectangle_Histogram
{
    public int input_Rectangle_Histogram(int[] height)
    {
        int h= height.length;
        int max_Area = 0;
        for(int i=0;i<h;i++)
        {
            int i_height = height[i];
            for(int j=i;j<h;j++)
            {
                i_height = Math.min(i_height, height[j]);
                int width = j-i+1;

                int area = i_height * width;
                max_Area = Math.max(max_Area, area);
            }
        }
        return max_Area;
    }
}
