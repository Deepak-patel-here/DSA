public class StringArrangementRecursion {
    public static void printArrangement(String str,String Arrange){
        if(str.length()==0){
            System.out.println(Arrange);
            return;
        }
        for(int i=0;i<str.length();i++){
            char myChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printArrangement(newStr,Arrange+myChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printArrangement(str,"");
    }
}
