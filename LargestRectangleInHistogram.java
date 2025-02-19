import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int[] findNextSmallerElement(int []arr){
        int n=arr.length;
        int []ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] findPrevSmallerElement(int []arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])st.pop();
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int []nse=findNextSmallerElement(heights);
        int []pse=findPrevSmallerElement(heights);
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,(heights[i]*(nse[i]-pse[i]-1)));
        }
        return max;

    }
    public static void main(String[] args) {
        int [] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
