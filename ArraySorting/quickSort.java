package ArraySorting;

import java.util.Scanner;
public class quickSort {
    public static int partition(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static void sort(int []arr,int low,int high){
        if(low<high){
            int part=partition(arr,low,high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
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
        sort(arr,0,n-1);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
