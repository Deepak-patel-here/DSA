import java.util.Scanner;
public class Count_digits {
    public static int countDigits(int n,int count){
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        int count =countDigits(num,0);
        System.out.println("The number of digit present in "+num+" is = "+count);
    }
}
