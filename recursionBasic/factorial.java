package recursionBasic;

import java.util.Scanner;

public class factorial {
    public static int factorial (int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        System.out.println("the factorial of "+num+" is :"+factorial(num));
    }
}
