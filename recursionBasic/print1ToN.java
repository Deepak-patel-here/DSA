package recursionBasic;

import java.util.Scanner;

public class print1ToN {
    public static void printNaturalNum(int num){
        if(num==0){
            return;
        }
        printNaturalNum(num-1);
        System.out.print(num+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        printNaturalNum(num);

    }
}
