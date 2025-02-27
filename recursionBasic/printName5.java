package recursionBasic;
import java.util.Scanner;
public class printName5 {
    public static int counter=1;
    public static void printName(String name){
        if(counter==6){
            return;
        }
        System.out.println(name);
        counter++;
        printName(name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name=sc.nextLine();
        printName(name);
    }
}
