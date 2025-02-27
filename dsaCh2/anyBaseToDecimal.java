package dsaCh2;
import java.util.Scanner;
public class anyBaseToDecimal {
    public static int toDecimal(int n,int b){
        int decimal=0;
        int i=1;
        while(n>0){
            int ld=n%10;
            n/=10;
            decimal+=ld*i;
            i*=b;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the base of the number : ");
        int b=sc.nextInt();
        System.out.println(toDecimal(num,b));
    }
}
