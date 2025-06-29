import java.util.Stack;

class IsValidSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty() && ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[')
                        || (c == '}' && stack.peek() == '{'))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

// leetcode url: https://leetcode.com/problems/valid-parentheses/
public class p_20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        IsValidSolution solution = new IsValidSolution();
        boolean result = solution.isValid(s);
        System.out.println("The result is: " + result);
    }
}
