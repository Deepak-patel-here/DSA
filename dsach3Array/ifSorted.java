package dsach3Array;

import java.util.Scanner;

public class ifSorted {
    public static boolean checkSorted(int []arr,int n){
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,2,3,4};
        System.out.println(checkSorted(arr,arr.length));
    }
}
