package lengthOfLastWord;

public class Solution {

    public int lengthOfLastWord(String s) {
        String trimStr = s.trim();

        int length = 0;

        for (int i = trimStr.length()-1; i >= 0 ; i--) {
            if (trimStr.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
