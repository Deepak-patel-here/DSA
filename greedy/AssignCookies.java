package greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;

        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;

        int i=0,j=0;
        while(j<m && i<n){
            if(g[i]<=s[j]){
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
    }

    public static void main(String[] args) {

    }
}
