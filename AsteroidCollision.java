import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int num:asteroids){
            boolean flag=false;
            while(!st.isEmpty() && num<0 && st.peek()>0){
                if(st.peek()<-num){
                    st.pop();
                    continue;
                }else if(st.peek()==-num)st.pop();
                flag=true;
                break;
            }
            if(!flag){
                st.push(num);
            }
        }

        int []ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
