class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequency = new int[2001];
        for (int i=0; i<frequency.length; ++i) {
            frequency[i] = 0;
        }
        for (int n : nums) {
            ++frequency[n+1000];
        }
        List<Integer>[] frequencyMap = new ArrayList[nums.length+1];
        for (int i=0; i<frequency.length; ++i) {
            if (frequencyMap[frequency[i]] == null) {
                frequencyMap[frequency[i]] = new ArrayList<>(); 
            }
            frequencyMap[frequency[i]].add(i-1000);
        }
        int[] solution = new int[k];
        int pos = 0;
        for (int i=frequencyMap.length-1; i>=0; --i) {
            if (frequencyMap[i] == null) {
                continue;
            }
            while (!frequencyMap[i].isEmpty()) {
                solution[pos] = frequencyMap[i].remove(0);
                --k;
                ++pos;
            }
            frequencyMap[i] = null;
            if (k==0) {
                break;
            }
        }
        return solution;
    }
}
