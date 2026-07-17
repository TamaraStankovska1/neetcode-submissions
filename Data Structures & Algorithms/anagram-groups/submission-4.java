class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String string : strs){
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            
            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(string);
        }
        return map.values().stream().toList();
    }
}
