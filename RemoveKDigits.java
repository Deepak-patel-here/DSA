import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return"0";
        Stack<Integer> st=new Stack<>();
        for(char ch:num.toCharArray()){
            int n=Character.getNumericValue(ch);
            while(!st.isEmpty() && k>0 && st.peek()>n){
                st.pop();
                k--;
            }
            st.push(n);
        }

        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(""+st.pop());
        }
        while(str.length()!=0 && str.charAt(str.length()-1)=='0'){
            str.deleteCharAt(str.length()-1);
        }
        if(str.length()==0)return "0";
        else return str.reverse().toString();

    }
    public static void main(String[] args) {

    }
}
