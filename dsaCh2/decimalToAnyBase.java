package dsaCh2;
import java.util.Scanner;
public class decimalToAnyBase {
    public static int count(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int convertBase(int num,int base){
        int n=num;
        int anybase=0;
        int i=0;
        while(n>0){
            int ld=n%base;
            n/=base;
            anybase=anybase+(ld*(int)Math.pow(10,i));
            i++;

        }
        return anybase;
//        int revBinary=0;
//        while(binary>0){
//            int ld=binary%10;
//            revBinary=(revBinary*10)+ld;
//            binary/=10;
//        }
//        return revBinary;
//        if(base==2){
//            return revBinary;
//        }else {
//            int i=0;
//            int octal=0;
//            int len=count(revBinary);
//            while(i<len){
//                int ld=revBinary%10;
//                octal=octal+(ld*(int)Math.pow(10,i));
//                i++;
//                revBinary/=10;
//            }
//            return octal;
//        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the base in which you want to convert : ");
        int b=sc.nextInt();
        System.out.println(convertBase(num,b));
    }
}
