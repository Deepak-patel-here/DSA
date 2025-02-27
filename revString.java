public class revString {
    public static void revStr(String Str,int i){
        if(i==0){
            System.out.print(Str.charAt(i));
            return;
        }
        System.out.print(Str.charAt(i));
        revStr(Str,i-1);

    }
    public static void main(String[] args) {
        String str="Deepak";
        int len=str.length()-1;
        revStr(str,len);
    }
}
