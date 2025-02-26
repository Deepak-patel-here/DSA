import java.util.Arrays;
import java.util.Collections;

public class kthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Sort in descending order
        Arrays.sort(numsBoxed, Collections.reverseOrder());

        return numsBoxed[k - 1];
    }
    public static void main(String[] args) {

    }
}
