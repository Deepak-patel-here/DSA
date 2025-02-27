package ArraySorting;

import java.util.Scanner;

public class bubbleSort {
    public static void sort(int []arr,int n ){
        for(int i=n-1;i>0;i--){
            boolean swap=true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=false;
                }
            }
            if(swap){
                System.out.println("Array is Already Swaped.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n=sc.nextInt();
        System.out.print("Enter the Element of the Array : ");
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array before sorting : ");
        for (int a:arr){
            System.out.print(a+" ");
        }

        System.out.print("\nArray after sorting : ");
        sort(arr,n);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
