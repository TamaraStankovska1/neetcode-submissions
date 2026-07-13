class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int count1 = 0;
    int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                count1++;
            } else count++;
        }
        if(count1>0){
            return false;
        }
       return true;
    }
}