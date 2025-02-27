package dsach3Array;
import java.util.Scanner;
public class barChar {
    public static void printBar(int []arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int floor=max;floor>=1;floor--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size=sc.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int [] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printBar(arr,size);
    }
}
