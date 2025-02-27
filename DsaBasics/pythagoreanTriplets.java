package DsaBasics;
import java.util.Scanner;
public class pythagoreanTriplets {
    public static void checkTriplets(int a,int b,int c){
        if(a>b){
            if(a>c){
                if((int)Math.pow(a,2)==(int)(Math.pow(b,2)+Math.pow(c,2))){
                    System.out.println("Yes ,they are Pythagorean Triplets.");
                }else{
                    System.out.println("No ,they are not Pythagorean Triplets.");
                }
            }else{
                if((int)Math.pow(c,2)==(int)(Math.pow(b,2)+Math.pow(a,2))){
                    System.out.println("Yes ,they are Pythagorean Triplets.");
                }else{
                    System.out.println("No ,they are not Pythagorean Triplets.");
                }
            }
        }else{
            if(b<c){
                if((int)Math.pow(c,2)==(int)(Math.pow(b,2)+Math.pow(a,2))){
                    System.out.println("Yes ,they are Pythagorean Triplets.");
                }else{
                    System.out.println("No ,they are not Pythagorean Triplets.");
                }
            }else{
                if((int)Math.pow(b,2)==(int)(Math.pow(c,2)+Math.pow(a,2))){
                    System.out.println("Yes ,they are Pythagorean Triplets.");
                }else{
                    System.out.println("No ,they are not Pythagorean Triplets.");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        checkTriplets(n1,n2,n3);

    }
}
