public class NumberOfCopyArray {
    public int countArrays(int[] original, int[][] bounds) {
        int n=original.length;
        int low=bounds[0][0];
        int high=bounds[0][1];

        for(int i=1;i<n;i++){
            int d=original[i]-original[i-1];

            int low2=d+low;
            int high2=d+high;

            low=Math.max(low2,bounds[i][0]);
            high=Math.min(high2,bounds[i][1]);

            if(low>high)return 0;
        }

        return high-low+1;
    }
    public static void main(String[] args) {

    }
}
