package dsaCh2;
import java.util.Scanner;
public class anyBaseSubtraction {
    public static int anySub(int n1,int n2,int b){
        int diff=0;
        int borrow=0;
        int i=1;
        while(n1>0 || n2>0){
            int ld1=n1%10;
            int ld2=n2%10;
            n1/=10;
            n2/=10;
            ld1=ld1-borrow;
            int digit=0;
            if(ld1>=ld2){
                borrow=0;
                digit=ld1-ld2;
            }else{
                borrow=1;
                digit=(ld1+b)-ld2;
            }
            diff+=digit*i;
            i*=10;
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2=sc.nextInt();
        System.out.print("Enter the base of those numbers : ");
        int b=sc.nextInt();
        System.out.println(anySub(num1,num2,b));
    }
}
