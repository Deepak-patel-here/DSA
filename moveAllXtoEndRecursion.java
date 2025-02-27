public class moveAllXtoEndRecursion {
    public static int count=0;
    public static String newStr="";
    public static void moveX(String str,int i){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(i)=='x'){
            count++;
            moveX(str,i+1);
        }else{
            newStr+=str.charAt(i);
            moveX(str,i+1);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveX(str,0);
    }
}
