package DsaBasics;
import java.util.Scanner;
public class GCDandLCM {
    public static int GCD(int n1,int n2){

        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        if(n1!=0){
            return n1;
        }else{
            return n2;
        }
    }
    public static int LCM(int n1,int n2,int gcd){
        int lcm=(n1*n2)/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers whose LCM and HCF you want : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int GCD=GCD(n1,n2);
        int LCM=LCM(n1,n2,GCD);
        System.out.println("The LCM and HCF of "+n1+" and "+n2+" is : "+LCM+" and "+GCD+" resp.");
    }
}
