public class findMinMaxArrRecursion {
    public static int findMax(int[]arr,int n){
        if(n==1){
            return arr[0];
        }
        if( arr[n-1]>findMax(arr,n-1)){
            return arr[n-1];
        }else{
            return findMax(arr,n-1);
        }
    }

    public static int findMin(int[]arr,int n){
        if(n==1){
            return arr[0];
        }
        if( arr[n-1]<findMax(arr,n-1)){
            return arr[n-1];
        }else{
            return findMax(arr,n-1);
        }
    }
    public static void main(String[] args) {
    int []arr={11,55,7,100,6};
    int n=arr.length;
        System.out.println(findMax(arr,n));
        System.out.println(findMin(arr,n));
    }
}
