public class SubstringContainingThree {
    public static int numberOfSubstrings(String s) {
        // int n=s.length();
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     int a=0,b=0,c=0;
        //     for(int j=i;j<n;j++){
        //         if(s.charAt(j)=='a')a++;
        //         else if(s.charAt(j)=='b')b++;
        //         else c++;

        //         if(a>=1 && b>=1 && c>=1)cnt++;
        //     }
        // }
        // return cnt;



        int n=s.length();
        int cnt=0;
        int i=0;
        int a=-1,b=-1,c=-1;
        while(i<n){
            if(s.charAt(i)=='a')a=i;
            else if(s.charAt(i)=='b')b=i;
            else c=i;

            if(a!=-1 && b!=-1 && c!=-1){
                cnt=cnt+1+(Math.min(a,Math.min(b,c)));
            }
            i++;
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}
