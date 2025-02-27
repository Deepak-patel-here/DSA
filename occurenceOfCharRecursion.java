public class occurenceOfCharRecursion {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurence(String str,int i,char val){
        if(i==str.length()){
            System.out.println("The First Occurence of "+val+" is :"+first);
            System.out.println("The Last Occurence of "+val+" is :"+last);
            return;
        }
        if(str.charAt(i)==val){
            if(first==-1){
                first=i;
            }else{
                last=i;
            }
        }
        findOccurence(str,(i+1),val);
    }
    public static void main(String[] args) {
        String str="aabcdhanabdan";
        char val='a';
        findOccurence(str,0,val);

    }
}
