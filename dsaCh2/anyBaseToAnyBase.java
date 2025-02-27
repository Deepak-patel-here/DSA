package dsaCh2;
import java.util.Scanner;
public class anyBaseToAnyBase {
    public static int anyToAny(int num,int b1,int b2){
        int convertedNum=0;
        int i=1;
        while(num>0){
            int ld=num%b2;
            num/=b2;
            convertedNum+=ld*i;
            i*=b1;
        }
        return convertedNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the base of the number : ");
        int b=sc.nextInt();
        System.out.print("Enter the base in which you want to convert: ");
        int b2=sc.nextInt();
        System.out.println(anyToAny(num,b,b2));
    }
}
