package Day_11;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_20
{
    public static void main(String[] args)
    {
        String s = "()[]{}";
        SolutionValidParentheses svp = new SolutionValidParentheses();
        System.out.println(svp.isValid(s));

    }
}
class SolutionValidParentheses
{
    public boolean isValid(String s) {
        HashMap<Character, Character> hp = new HashMap<>();
        hp.put(')', '(');
        hp.put('}', '{');
        hp.put(']', '[');

        Stack<String> stack1 = new Stack<>();

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
