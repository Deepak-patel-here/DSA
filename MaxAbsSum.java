public class MaxAbsSum {
    public static int maxAbsoluteSum(int[] nums) {
        int maxEle=0,minEle=0,maxAns=0,minAns=0;

        for(int num:nums){
            maxEle=Math.max(maxEle+num,num);
            minEle=Math.min(minEle+num,num);

            maxAns=Math.max(maxAns,maxEle);
            minAns=Math.min(minAns,minEle);
        }
        return Math.max(maxAns,Math.abs(minAns));
    }
    public static void main(String[] args) {
    }
}
