public class FruitsInBasket {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int  n=fruits.length;
        int [] placed=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(placed[j]==0){
                    if(fruits[i]<=baskets[j]){
                        placed[j]=1;
                        break;
                    }
                }

            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(placed[i]==0)cnt++;
        }

        return cnt;

    }
    public static void main(String[] args) {

    }
}
