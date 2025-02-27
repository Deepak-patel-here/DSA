package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);


    }
}
