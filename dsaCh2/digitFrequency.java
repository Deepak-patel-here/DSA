package dsaCh2;

import java.util.Scanner;
public class digitFrequency {
    public static int findFrequency(int n,int d){
        int count=0;
        while(n!=0){
            int ld=n%10;
            if(ld==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the Digit : ");
        int digit=sc.nextInt();
        System.out.println("The Frequency of "+digit+" in "+num+" is : "+findFrequency(num,digit));
    }
}
