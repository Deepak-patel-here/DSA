public class Recolor {
    public int minimumRecolors(String blocks, int k) {
        int l=0,r=0;
        int cnt=0;
        while(r<k){
            if(blocks.charAt(r)=='W')cnt++;
            r++;
        }
        int min=Integer.MAX_VALUE;
        min=Math.min(min,cnt);

        while(r<blocks.length()){
            if(blocks.charAt(r)=='W')cnt++;
            while((r-l+1)>k){
                if(blocks.charAt(l)=='W')cnt--;
                l++;
            }
            min=Math.min(min,cnt);
            r++;
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
