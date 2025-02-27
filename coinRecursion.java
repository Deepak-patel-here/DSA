public class coinRecursion {
    public static int coinCountWays(int[]coin,int sum,int n){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(n<=0){
            return 0;
        }

        return coinCountWays(coin,sum-coin[n-1],n)+coinCountWays(coin,sum,n-1);


    }
    public static void main(String[] args) {
    int []coin ={2,5,3,6};
    int n=coin.length;
    int sum=10;
    System.out.println(coinCountWays(coin,sum,n));
    }
}
