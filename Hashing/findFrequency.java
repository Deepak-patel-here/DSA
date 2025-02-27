package Hashing;

import java.util.Scanner;

public class findFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.print("Enter the Array elements : ");
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int [] hash=new int [13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.print("Enter the number which you want to find : ");
        int q=sc.nextInt();
        while(q>0){
            int num=sc.nextInt();
            System.out.println(hash[num]);
        }
    }
}
