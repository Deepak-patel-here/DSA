package ArraySorting;

import java.util.Scanner;

public class selectionSort {

    public static void sort(int []arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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
