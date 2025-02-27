package ArraySorting;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList <Integer>arrayList=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                arrayList.add(arr[left]);
                left++;
            }else{
                arrayList.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            arrayList.add(arr[left]);
            left++;
        }

        while(right<=high){
            arrayList.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=arrayList.get(i-low);
        }
    }
    public static void sort(int []arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
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
