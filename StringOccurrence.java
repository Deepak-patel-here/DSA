public class StringOccurrence {
    public static int strStr(String haystack, String needle){
        if(haystack.equals(needle))return 0;
        int n=haystack.length();
        int m=needle.length();
        int r=0,l=0;
        while(r<=n){
            String str=haystack.substring(l,r);
            if(str.equals(needle))return l;
            else{
                if((str.length())==m){
                    l++;
                }
            }
            r++;
        }
        return -1;


    }
    public static void main(String[] args) {

    }
}
