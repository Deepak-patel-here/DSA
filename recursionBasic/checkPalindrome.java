package recursionBasic;

import java.util.Scanner;

public class checkPalindrome {
    public static void palindrome(String str,int i){
        if(i==str.length()-1-i){
            System.out.println("Yes,the string is palindrome.");
            return;
        }
        if(str.charAt(i)==str.charAt(str.length()-1-i)){
            palindrome(str,i+1);
        }else{
            System.out.println("No,the string is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();
        palindrome(str,0);

    }
}
