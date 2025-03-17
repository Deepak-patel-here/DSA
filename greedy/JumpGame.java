package greedy;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIndx=0;
        for(int i=0;i<n;i++){
            if(i>maxIndx)return false;
            maxIndx=Math.max(maxIndx,nums[i]+i);
            if(maxIndx>=n-1)return true;

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
