class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        char [] magazineChars = magazine.toCharArray();
        Map<Character, Integer> map2 = new HashMap<>();
        char [] ransomChars = ransomNote.toCharArray();

        for (char magazineChar : magazineChars) {
            map1.put(magazineChar,
                    map1.getOrDefault(magazineChar, 0) + 1);
        }

        for (char ransomChar : ransomChars) {
            map2.put(ransomChar,
                    map2.getOrDefault(ransomChar, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            
            if(!map1.containsKey(key) || map1.get(key) < value){
                return false;
            }
        }
        return true;
    }
}