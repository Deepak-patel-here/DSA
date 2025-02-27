package DsaBasics;
import java.util.Scanner;
public class primeFcatorisation {
    public static void primeFactors(int num){
        int d=2;
        while(num>1){
            if(num%d==0){
                num=num/d;
                System.out.print(d);
            }else{
                d++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose prime factors you want : ");
        int n1=sc.nextInt();
        primeFactors(n1);
    }
}
