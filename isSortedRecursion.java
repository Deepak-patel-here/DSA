public class isSortedRecursion {
    public static boolean isSortedArr(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSortedArr(arr,i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,8,5,6};
        boolean check=isSortedArr(arr,0);
        System.out.println(check);
    }
}
