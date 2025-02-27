import java.sql.SQLOutput;
import java.util.Scanner;

public class print_digits {
    public static void printSingleDigits(int num){
        int count=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        int pow=(int)Math.pow(10,count-1);
        while(pow!=0){
            int digit=num/pow;
            System.out.println(digit);
            num=num%pow;
            pow=pow/10;
        }
    }
    public static void printDigits(int num){
        int rev=0;
        while(num!=0){
            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
//        System.out.println(rev);
        while(rev!=0){
            int ld=rev%10;
            System.out.println(ld);
            rev=rev/10;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        printDigits(num);
        printSingleDigits(num);
    }
}
