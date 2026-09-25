package Day_12;

import java.util.*;
import java.util.HashMap;

public class Daily_Temperatures
{
    public static void main(String[] args)
    {
       int[] temperatures = {73,74,75,71,69,72,76,73};
       int len = temperatures.length;

       Sol_Daily_Temperatures solDailyTemperatures = new Sol_Daily_Temperatures();
       int[] result = solDailyTemperatures.nextDegree(temperatures);

       System.out.println("Result:" + Arrays.toString(result));

    }

}

class Sol_Daily_Temperatures
{
    public int[] nextDegree(int[] temperatures)
    {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for(int idx=n-1;idx>=0;idx--)
        {
            while(!stack.empty() && temperatures[idx] >= temperatures[stack.peek()])
            {
                  stack.pop();
            }

            if(!stack.empty())
            {
                result[idx] = stack.peek() - idx;
            }
            // pushing the first index
            stack.push(idx);
        }
        return result;
    }
}
