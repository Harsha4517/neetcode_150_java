import java.util.HashMap;

class LengthOfLongestSubstringSolution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class p_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        LengthOfLongestSubstringSolution solution = new LengthOfLongestSubstringSolution();
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("The result is: " + result);
    }
}
