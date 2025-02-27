import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
