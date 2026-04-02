class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> anagramMap = new HashMap<>();
        List<Integer> charCount;
        for (String s : strs) {
            charCount = new ArrayList<>();
            for (int i=0; i<26; ++i) {
                charCount.add(0);
            }
            for (int i=0; i<s.length(); ++i) {
                int index = (int) s.charAt(i) - (int) 'a';
                charCount.set(index, charCount.get(index)+1);
            }
            if (!anagramMap.containsKey(charCount)) {
                anagramMap.put(charCount, new ArrayList<>());
            }
            anagramMap.get(charCount).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> a : anagramMap.values()) {
            result.add(a);
        }
        return result;
    }
}
