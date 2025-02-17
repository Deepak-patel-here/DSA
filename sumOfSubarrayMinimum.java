import java.util.Stack;
public class sumOfSubarrayMinimum {

        public final int mod = 1000000007;

        public int[] findNse(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
                ans[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
            return ans;
        }

        public int[] findPse(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
                ans[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }
            return ans;
        }

        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;
            int[] nse = findPse(arr);
            int[] pse = findNse(arr);
            long total = 0;

            for (int i = 0; i < n; i++) {
                int left = i - pse[i];
                int right = nse[i] - i;
                total = (total + ((long) left * right % mod * arr[i]) % mod) % mod;
            }
            return (int)total;
        }

    public static void main(String[] args) {

    }
}
