package DsaBasics;

import java.util.Scanner;

public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bubls : ");
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
