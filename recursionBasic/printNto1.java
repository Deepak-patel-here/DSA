package recursionBasic;

import java.util.Scanner;

public class printNto1 {
    public static void printN(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        printN(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        printN(num);
    }
}
