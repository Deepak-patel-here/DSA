package recursionBasic;

import java.util.Scanner;

public class finbonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println(fibo(num));
    }
}
