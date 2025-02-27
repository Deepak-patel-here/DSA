package dsach3Array;

import java.util.Scanner;

public class secondLargestElement {
    // better and brute force solution.
//    public static int secondLargest(int []arr){
//        int max=arr[0];
//        int n=arr.length-1;
//        int secLarge=arr[0];
//        for(int i=0;i<=n;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//
//        }
//        for(int i=0;i<=n;i++){
//            if(secLarge<arr[i] && arr[i]!=max){
//                secLarge=arr[i];
//            }
//        }
//        return  secLarge;
//    }

    //optimul solution
    public static int secondLargest(int []arr){
        int n=arr.length;
        int large=arr[0];
        int slarge=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                slarge=large;
                large=arr[i];
            }else if(arr[i]<large && arr[i]>slarge){
                slarge=arr[i];
            }
        }
        return slarge;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={1,2,4,7,7,0};
        int secLarge=secondLargest(arr);
        System.out.print("The second Largest Element in the array is : "+secLarge);
    }
}
