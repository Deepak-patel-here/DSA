public class CheckIfDigitsAreEqualinStringAfterOperationsI {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String str="";
            for(int i=0;i<s.length()-1;i++){
                int num=Character.getNumericValue(s.charAt(i));
                int num2=Character.getNumericValue(s.charAt(i+1));
                int ans=(num+num2)%10;
                str+=""+ans;
            }
            s=str;
        }
        if(s.charAt(0)==(s.charAt(1))){
            return true;
        }else return false;
    }
    public static void main(String[] args) {

    }
}
