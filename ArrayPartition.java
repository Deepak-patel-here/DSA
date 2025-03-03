import java.util.ArrayList;
import java.util.List;

public class ArrayPartition {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> less=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]<pivot)less.add(nums[i]);
            else if(nums[i]>pivot)greater.add(nums[i]);
            else equal.add(nums[i]);
        }
        int k=0;
        for(int i=0;i<less.size();i++){
            nums[k]=less.get(i);
            k++;
        }
        for(int i=0;i<equal.size();i++){
            nums[k]=equal.get(i);
            k++;
        }
        for(int i=0;i<greater.size();i++){
            nums[k]=greater.get(i);
            k++;
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
