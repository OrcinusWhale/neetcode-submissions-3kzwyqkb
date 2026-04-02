class Solution {
    public void islandsAndTreasure(int[][] grid) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i=0; i<grid.length; ++i) {
            for (int j=0; j<grid[i].length; ++j) {
                if (grid[i][j] == 0) {
                    Collections.addAll(queue,
                    i-1, j,
                    i+1, j,
                    i, j-1,
                    i, j+1);
                }
            }
        }
        int level = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int k=0; k<levelSize; k+=2) {
                int i = queue.removeFirst();
                int j = queue.removeFirst();
                if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]!=Integer.MAX_VALUE) {
                    continue;
                }
                grid[i][j] = level;
                Collections.addAll(queue,
                i-1, j,
                i+1, j,
                i, j-1,
                i, j+1);
            }
            ++level;
        }
    }
}
