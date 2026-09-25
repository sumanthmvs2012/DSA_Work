package Day_12;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses
{
    public static void main(String[] args)
    {
      int n= 2;
      List<String> result = new ArrayList<String>();
      Sol_Generate_Parentheses solGenerateParentheses = new Sol_Generate_Parentheses();
      solGenerateParentheses.generate(result, n,0,0,"");
      System.out.println("Result in string one shot: "+ result);
    }
}

class Sol_Generate_Parentheses
{
    //max the initial length.
    //result is the result stored
    // str is where we are intializing the string and adding the parathesis

    public void generate(List<String> result, int max, int open, int close, String str)
    {
        if(str.length() ==(2*max))
        {
            result.add(str);
        }

        if(open<max)
        {
            generate(result, max, open+1, close, str+"(");
        }

        if(close<max)
        {
            generate(result, max, open, close+1, str+")");
        }
    }
}