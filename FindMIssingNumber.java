public class FindMIssingNumber {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] map = new int[(n * n + 1)];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[grid[i][j]] += 1;
                ;
            }
        }
        int missing = 0;
        int duplicate = 0;
        for (int i = 1; i < map.length; i++) {
            if (map[i] == 0) missing = i;
            if (map[i] == 2) duplicate = i;
        }

        ans[0] = duplicate;
        ans[1] = missing;
        return ans;
    }
        public static void main(String[] args) {

    }
}
