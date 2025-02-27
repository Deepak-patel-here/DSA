package dsach3Array;
import java.util.Scanner;
public class largestElement {
    public static int findLargest(int []arr){
        int max=arr[0];
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.print("Enter the array element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=findLargest(arr);
        System.out.println("The largest element in the array is : "+large);
    }
}
