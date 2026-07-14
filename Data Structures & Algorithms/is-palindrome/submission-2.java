class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = s.toCharArray();
        char[] reversedchars = new char[chars.length];

        for (int i = chars.length - 1; i>=0; i--) {
            reversedchars[chars.length - 1 - i] = chars[i];
        }
        if (Arrays.equals(chars, reversedchars)) {
            return true;
        }
        return false;
    }
}