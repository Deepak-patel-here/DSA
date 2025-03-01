public class ArrayOperation {
    public static int[] applyOperations(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                i=i+2;
            }else i++;
        }
        int j=0;
        for(int k=0;k<n;k++){
            if(nums[k]!=0){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
