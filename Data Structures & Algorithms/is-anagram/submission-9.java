class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> charCount = new HashMap<>();
        for (String c : s.split("")) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            } else {
                charCount.put(c, charCount.get(c)+1);
            }
        }
        for (String c : t.split("")) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c)-1);
            if(charCount.get(c) < 0) {
                return false;
            }
        }
        for (int n : charCount.values()) {
            if (n > 0) {
                return false;
            }
        }
        return true;
    }
}
