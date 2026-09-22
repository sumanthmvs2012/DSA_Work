package Day_11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Min_Stack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Sol_min_stack solMinStack = new Sol_min_stack();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            solMinStack.push(value);
        }

        //Sol_min_stack stack1 = new Sol_min_stack();

        //Stack<Integer> stack1 = new Stack<>();
//        stack1.push(10);
//        stack1.push(15);
//        stack1.push(30);
//        stack1.push(20);
//        stack1.push(5);

        System.out.println(solMinStack);

        System.out.println("Top: " + solMinStack.top());
        System.out.println("Min: " + solMinStack.getMin());

        solMinStack.pop();

        System.out.println("Top after pop: " + solMinStack.top());
        System.out.println("Min after pop: " + solMinStack.getMin());

        sc.close();
    }
}


class Sol_min_stack
{
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public Sol_min_stack()
    {
       stack = new Stack<>();
       minstack = new Stack<>();
    }

    public void push(int value)
    {
        stack.push(value);

        if(minstack.empty() || value <= minstack.peek())
        {
           minstack.push(value);
        }

    }

    public void pop()
    {
      int popped = stack.pop();

      if(popped == minstack.peek())
      {
          minstack.pop();
      }
    }

    public int top()
    {
      return stack.peek();
    }

    public int getMin()
    {
        return minstack.peek();
    }
}
