class Solution {

    public String encode(List<String> strs) {       
        String encoded = "";
        for (String s : strs) {
            encoded += s.length();
            encoded += "#";
            encoded += s;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        for (int i=0; i<str.length(); ++i) {
            String s = "";
            int length = 0;
            while (str.charAt(i) != '#') {
                length *= 10;
                length += str.charAt(i) - '0';
                ++i;
            }
            ++i;
            int end = i + length;
            for (; i<end; ++i) {
                s += str.charAt(i);
            }
            strs.add(s);
            --i;
        }
        return strs;
    }
}
