import java.util.Stack;

class RPNSolution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}

// leetcode url: https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class p_150 {
    public static void main(String[] args) {
        String[] s = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        RPNSolution solution = new RPNSolution();
        int result = solution.evalRPN(s);
        System.out.println("The result is: " + result);
    }
}
