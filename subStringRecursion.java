public class subStringRecursion {
    public static void subString(String str,int i,String newStr){
        if(i==str.length()){
            System.out.print(newStr+" ");
            return;
        }
        char myChar=str.charAt(i);
        subString(str,i+1,newStr+myChar);
        subString(str,i+1,newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        subString(str,0,"");
    }
}
