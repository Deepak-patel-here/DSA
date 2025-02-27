package dsaCh2;
import java.util.Scanner;
public class anyBaseAddition {
    public static int anyAdd(int num1,int num2,int b){
        int sum=0;
        int carry=0;
        int i=1;
        while(num1>0|| num2>0||carry>0){
            int ld1=num1%10;
            int ld2=num2%10;
            num1/=10;
            num2/=10;
            int addLd=ld1+ld2+carry;
            sum+=(addLd%b)*i;
            i*=10;
            carry=addLd/8;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2=sc.nextInt();
        System.out.print("Enter the base of those numbers : ");
        int b=sc.nextInt();
        System.out.println(anyAdd(num1,num2,b));
    }
}
