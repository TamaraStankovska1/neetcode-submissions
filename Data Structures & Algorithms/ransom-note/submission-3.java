
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        Map<Character, Integer> magazineMap = new HashMap<>();
        char[] ransomNoteChars = ransomNote.toCharArray();
        Map<Character, Integer> ransomMap = new HashMap<>();


        for (int i = 0; i < magazineChars.length; i++) {
            magazineMap.put(
                    magazineChars[i],
                    magazineMap.getOrDefault(magazineChars[i], 0) + 1
            );
        }
        for (int j = 0; j < ransomNoteChars.length; j++) {
            ransomMap.put(
                    ransomNoteChars[j],
                    ransomMap.getOrDefault(ransomNoteChars[j], 0) + 1
            );
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (!magazineMap.containsKey(key) || magazineMap.get(key) < value) {
                return false;
            }
        }

        return true;
    }
}