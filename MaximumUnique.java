import java.util.Arrays;

public class MaximumUnique {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int i=0;
        Arrays.sort(nums);
        while(i<n){
            if(sum<0)sum=0;
            sum+=nums[i];
            while(i+1<n && nums[i+1]==nums[i])i++;
            i++;

        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
