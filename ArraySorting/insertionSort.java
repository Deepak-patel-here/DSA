package ArraySorting;

import java.util.Scanner;

public class insertionSort {
    public static void sort(int []arr,int n ){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
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
