import java.util.HashMap;

public class DivideArray {
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }

        for(int num:mpp.values()){
            System.out.println(num);
            if(num%2!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
