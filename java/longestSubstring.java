import java.util.HashMap;
import java.util.Map;

public class longestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap=new HashMap<>();
        int start=0;
        int maxLength=0;

        for(int end=0;end<s.length();end++) {
            char currentChar=s.charAt(end);
            if(charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar)>=start) {
                start=charIndexMap.get(currentChar)+1;
            }
            charIndexMap.put(currentChar, end);
            maxLength=Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));  // Output: 3
        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));  // Output: 1
        String s3 = "pwwkqzkew";
        System.out.println(lengthOfLongestSubstring(s3));  // Output: 3
    }
}

