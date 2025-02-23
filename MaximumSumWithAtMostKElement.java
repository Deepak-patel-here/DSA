import java.util.ArrayList;
import java.util.Collections;

public class   {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n = grid.length;
        int m = grid[0].length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr.add(grid[i][j]);
            }
            Collections.sort(arr);
            for (int a = 0; a < limits[i]; a++) {
                temp.add(arr.get(arr.size() - 1 - a));
            }
        }
        long sum = 0;
        Collections.sort(temp);
        for (int i = 0; i < k; i++) {
            sum += temp.get(temp.size() - 1 - i);
        }
        return sum;
    }

        public static void main(String[] args) {

    }
}
