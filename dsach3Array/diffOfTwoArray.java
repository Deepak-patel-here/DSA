package dsach3Array;

import java.util.Scanner;

public class diffOfTwoArray {
    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void minusArray(int[]arr1,int[]arr2,int n1,int n2){
        int []diff=new int[n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        int borrow=0;
        while(k>=0){
            int d=0;
            int val=j>=0?arr2[j]:0;
            if(arr1[i]+borrow>=val){
                d=arr1[i]+borrow-val;
                borrow=0;
            }else {
                d=arr1[i]+borrow+10-val;
                borrow=-1;
            }
            diff[k]=d;
            i--;k--;j--;
        }

        print(diff);

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
        minusArray(arr1,arr2,size1,size2);
    }
}
