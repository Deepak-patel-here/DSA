package greedy;

public class JumpGameII {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;
        int max=0,edge=0,jumps=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]+i);
            if(i==edge){
                jumps++;
                edge=max;
            }
            if(edge>=n-1)return jumps;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
