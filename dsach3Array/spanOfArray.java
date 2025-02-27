package dsach3Array;
import java.util.Scanner;
public class spanOfArray {
    public static int findSpan(int []arr,int n){
        int min=arr[0],max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return max-min;
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
        System.out.println("The span of the Array is :"+findSpan(arr,arr.length));
    }
}
