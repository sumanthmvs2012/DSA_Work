package Day5_DSA_TwoPointers;

public class Container_with_Most_water {
    public static void main(String[] args)
    {
        Container_with_Most_water cmw = new Container_with_Most_water();
        int[] height = {1,8,6,2,5,4,8,3,7};

        int res = cmw.maxArea(height);
        System.out.println("Result for Container_with_Most_water:- " + res);
    }

    public int maxArea(int[] height)
    {
        int len = height.length;
        int right = len -1;
        int left = 0;
        int maximumArea = 0;

        while(left< right) {
            int area = Math.min(height[right], height[left]) * (right - left);

            maximumArea = Math.max(area, maximumArea);

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maximumArea;
    }
}
