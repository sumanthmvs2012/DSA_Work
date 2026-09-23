package Day_11;

import java.util.Stack;

public class evalRPN
{
    public static void main(String[] args)
    {
        Sol_evalRPN solEvalRPN = new Sol_evalRPN();
        String[] token= {"2","1","+","3","*"};
        int result = solEvalRPN.solution(token);
        System.out.println("Result: "+ result);
    }
}

class Sol_evalRPN
{
    public int solution(String[] tokens)
    {
        Stack<String> stack = new Stack<>();

        for(String s: tokens)
        {
            if(validateSymbols(s))
            {
               int num2 = Integer.parseInt(stack.pop());
               int num1 = Integer.parseInt(stack.pop());
               int res = 0;
               if(s.equals("+"))
               {
                   res = num2 + num1;
               }
               else if(s.equals("-"))
               {
                   res = num1 - num2;
               }
               else if(s.equals("/"))
               {
                   res = num1 / num2;
               }
               else if(s.equals("*"))
               {
                   res = num2 * num1;
               }
               stack.push(Integer.toString(res));
            }
            else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    private boolean validateSymbols(String str)
    {
        if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*") )
        {
          return true;
        }
        return false;
    }
}
