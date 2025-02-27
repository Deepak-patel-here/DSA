package DsaBasics;
import java.util.Scanner;


public class inverseNumber {
    public static int pow(int num,int exp){
        for(int i=1;i<=exp;i++){
            num=num*10;
        }
        return  num;
    }
    public static int myInverse(int num){

        int count=0;
        int inverseNum=0;
        while(num!=0){
            int ld=num%10;
            count++;
            inverseNum+=count*pow(1,ld-1);
            num=num/10;
        }
        return inverseNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whose inverse you want: ");
        int num=sc.nextInt();
        int inverse=myInverse(num);
        System.out.println("The inverse of "+num+" is "+inverse);
    }
}
