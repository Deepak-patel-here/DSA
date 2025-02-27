package dsach3Array;

import java.util.Scanner;

public class findElement {
    public static int binarySearch(int []arr,int n,int val){
        int start=0;
        int end=n-1;
        int mid=-1;
        while(start<end){
            mid=(start+(end-start))/2;
            if(arr[mid]==val){
                return mid;
            } else if (arr[mid]<val) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        mid=-1;
        return mid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size=sc.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number which you want to find: ");
        int val=sc.nextInt();

        if(binarySearch(arr,size,val)==-1){
            System.out.println("The element is not present in the array.");
        }else{
            System.out.println("The element is present at index :"+binarySearch(arr,size,val));
        }
    }
}
