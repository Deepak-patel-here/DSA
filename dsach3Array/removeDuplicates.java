package dsach3Array;

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates {
    public static int remove(int[]arr,int n){
//brute force
//        int unique=arr[0];
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        arrayList.add(unique);
//        for(int i=0;i<n;i++){
//            if(unique==arr[i]){
//
//            }else{
//                unique=arr[i];
//                arrayList.add(unique);
//            }
//        }
//        for(int i=0;i<arrayList.size();i++){
//            arr[i]=arrayList.get(i);
//        }
//        return arrayList.size();
    int i=0;
    for(int j=1;j<n;j++){
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;
        }

    }
        return i+1;
  }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,1,2,2,2,3,3};
        System.out.println("\nThe number of unique element in the sorted array is : "+remove(arr,arr.length));
    }
}
