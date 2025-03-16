import java.util.Arrays;

public class RepairCar {
    public long repairCars(int[] ranks, int cars) {
        int n=ranks.length;
        Arrays.sort(ranks);
        long low=1,high=ranks[0]*(long)cars*cars;
        long ans=high;

        while(low<=high){
            long mid=low+(high-low)/2;
            if(isPossible(ranks,mid,cars)){
                ans=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return ans;
    }

    public boolean isPossible(int []arr,long mid,int cars){
        int repaired=0;
        for(int num:arr){
            int cnt=(int)Math.sqrt(mid/num);
            repaired+=cnt;
            if(repaired>=cars)return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
