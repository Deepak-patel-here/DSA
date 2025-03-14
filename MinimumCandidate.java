public class MinimumCandidate {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        int low =1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(candies[i],high);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            System.out.println("high="+high);
            System.out.println("low="+low);

            if(isPossible(candies,mid,k)){
                ans=Math.max(ans,mid);
                low=mid+1;

            }else{
                high=mid-1;

            }
        }
        return ans;


    }
    public boolean isPossible(int []arr,int mid,long k){
        int []temp=arr;
        int n=arr.length;
        long sum=0;
        for(int candy:arr){
            sum+=candy/mid;
        }
        System.out.println(sum);
        if(sum>=k)return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
