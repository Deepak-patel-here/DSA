import java.util.Arrays;

public class ClosetPrimeNumber {

    public static  int[] closestPrimes(int left, int right) {
        boolean [] isPrime=new boolean[right+1];
        Arrays.fill(isPrime,true);

        if(right >= 0) isPrime[0] = false;
        if(right >= 1) isPrime[1] = false;

        for(int p=2;p*p<=right;p++){
            if(isPrime[p]){
                for(int i= p*p;i<=right;i+=p ){
                    isPrime[i]=false;
                }
            }
        }
        int prev=-1;
        int bestDiff=Integer.MAX_VALUE;
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;

        for(int i=Math.max(2,left);i<=right;i++){
            if(isPrime[i]){
                if(prev!=-1){
                    int diff=i-prev;
                    if(diff<bestDiff){
                        bestDiff=diff;
                        ans[0]=prev;
                        ans[1]=i;

                    }

                }
                prev=i;
            }
        }

        return ans;



    }
    public static void main(String[] args) {

    }
}
