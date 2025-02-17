public class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int leftMax=0,rightMax=0;
        int ans=0;
        while(l<r){
            if(height[l]<height[r]){
                if(leftMax>height[l]){
                    ans+=leftMax-height[l];
                }else leftMax=height[l];
                l++;
            }else{
                if(rightMax>height[r])ans+=rightMax-height[r];
                else rightMax=height[r];
                r--;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
