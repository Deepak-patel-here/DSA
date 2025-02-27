public class callWaysRecursion {
    public static int countWays(int n){
        if(n<=1){
            return 1;
        }
        int single=countWays(n-1);
        int pair=(n-1)*countWays(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(countWays(n));
    }
}
