package String;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int pointer = 0;
        int max = 0;
        StringBuilder sBuilder = new StringBuilder();
        while (pointer < s.length()) {
            char c = s.charAt(pointer);
            int index = sBuilder.indexOf(String.valueOf(c));
            if (index >= 0) {
                sBuilder.delete(0, index + 1);
            }
            sBuilder.append(c);
            max = Math.max(max, sBuilder.length());
            pointer++;
        }
        return max;

    }
}
