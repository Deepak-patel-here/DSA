public class NumberofSubarraysWithOddSum {
    public int numOfSubarrays(int[] arr) {
        int pre_sum=0;
        int even=1,odd=0,res=0;
        final int mod=1000000007;

        for(int num:arr){
            pre_sum+=num;

            if(pre_sum%2==0){
                res=(res+odd)%mod;
                even++;
            }else{
                res=(res+even)%mod;
                odd++;
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
