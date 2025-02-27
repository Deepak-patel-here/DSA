package recursionBasic;

import java.util.Scanner;

public class recursionRevArray {
    public static void printArray(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    //Using single pointer
    public static void revArray2(int[] arr,int i){
        if(i==arr.length-1-i){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;

        revArray2(arr,i+1);
    }
    //Using Two pointer
    public static void revArray1(int []arr,int strt,int end){
        if(strt==end){
            return;
        }
        int temp=arr[strt];
        arr[strt]=arr[end];
        arr[end]=temp;
        revArray1(arr,strt+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size=sc.nextInt();
        int []arr=new int [size];
        System.out.print("Enter the Array elements : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The reverse of the Array is :");
        revArray1(arr,0,size-1);
        printArray(arr);
        System.out.print("\nThe reverse of the Array is :");
        revArray2(arr,0);
        printArray(arr);

    }
}
