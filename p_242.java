class AnagramSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] countArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
            countArray[t.charAt(i) - 'a']--;
        }

        for (int val : countArray) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

// leetcode url: https://leetcode.com/problems/valid-anagram/
public class p_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        AnagramSolution solution = new AnagramSolution();
        Boolean result = solution.isAnagram(s, t);
        System.out.println("The result is: " + result);
    }
}
