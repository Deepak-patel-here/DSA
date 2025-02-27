public class removeDuplicate {
    public static boolean [] map=new boolean[26];
    public static void removeDuplicateChar(String str,int i,String newStr){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(i);
        if(map[currentChar-'a']){
            removeDuplicateChar(str,i+1,newStr);
        }else{
            newStr+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicateChar(str,i+1,newStr);
        }
    }
    public static void main(String[] args) {
        String str="deepak";
        removeDuplicateChar(str,0,"");

    }
}
