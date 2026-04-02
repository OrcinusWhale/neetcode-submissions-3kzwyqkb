class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<ArrayList<String>, ArrayList<String>> anagramMap = new HashMap<>();
        String[] chars;
        ArrayList<String> charsList;
        for (String s : strs) {
            chars = s.split("");
            Arrays.sort(chars);
            charsList = new ArrayList<>(Arrays.asList(chars));
            if (!anagramMap.containsKey(charsList)) {
                anagramMap.put(charsList, new ArrayList<>());
            }
            anagramMap.get(charsList).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> a : anagramMap.values()) {
            result.add(a);
        }
        return result;
    }
}
