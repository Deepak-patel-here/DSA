public class RobberHouse {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int num:nums){
            low=Math.min(num,low);
            high=Math.max(num,high);
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }else low=mid+1;


        }
        return ans;
    }

    public boolean helper(int []nums,int mid,int k){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                cnt++;
                i++;
            }
        }
        return cnt>=k;
    }

    public static void main(String[] args) {

    }
}
