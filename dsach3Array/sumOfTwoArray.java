package dsach3Array;

import java.util.Scanner;

public class sumOfTwoArray {
    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sumArray(int[]arr1,int[]arr2,int n1,int n2){
        int []arr3=new int [n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
        int carry=0;
        while(k>=0){
            int d=carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry=d/10;
            d=d%10;
            arr3[k]=d;
            k--;
            i--;
            j--;

        }
        if(carry !=0){
            System.out.print(carry);
        }
        print(arr3);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size1=sc.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int [] arr1=new int [size1];
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the Array: ");
        int size2=sc.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int [] arr2=new int [size2];
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        sumArray(arr1,arr2,size1,size2);
    }
}
