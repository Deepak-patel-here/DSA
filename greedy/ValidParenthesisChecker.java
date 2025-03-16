package greedy;

public class ValidParenthesisChecker {
    public boolean checkValidString(String s) {
        int min=0, max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                min++;
                max++;
            }else if(ch==')'){
                min=Math.max(0,min-1);
                max--;
            }else{
                min=Math.max(0,min-1);
                max++;
            }

            if(max<0)return false;
        }

        return min==0;
    }

    public static void main(String[] args) {

    }
}
