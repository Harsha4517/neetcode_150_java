class IsPalindromeSolution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !isAlphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}

// leetcode url: https://leetcode.com/problems/valid-palindrome/
public class p_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        IsPalindromeSolution solution = new IsPalindromeSolution();
        boolean result = solution.isPalindrome(s);
        System.out.println("The result is: " + result);
    }
}
