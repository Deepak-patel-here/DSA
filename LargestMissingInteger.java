import java.util.HashMap;
import java.util.Map;

public class LargestMissingInteger {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(n<k)return -1;
        if(n==k){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int l=0,r=k-1;
        while(r<n){
            for(int i=l;i<=r;i++){
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            }
            if(r-l+1>=k)l++;
            r++;
        }
        int ans=-1;
        int val=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            val=entry.getValue();
            if(val==1){
                ans=Math.max(ans,entry.getKey());
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
