package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class heighest_and_lowest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.print("Enter the sizeof the Array : ");
        int n=sc.nextInt();
        System.out.print("Enter the Element of the Array : ");
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=0,minFreq=n;
        int maxEle=0,minEle=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count=entry.getValue();
            int ele=entry.getKey();
            if(count>maxFreq){
                maxEle=ele;
                maxFreq=count;
            }

            if(count<minFreq){
                minEle=ele;
                minFreq=count;
            }
        }

        System.out.println("the highest frequency element is : "+maxEle);
        System.out.println("the Lowest frequency element is : "+minEle);



    }
}
