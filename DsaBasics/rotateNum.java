package DsaBasics;
import java.util.Scanner;
public class rotateNum {
    public static int count(int num){
        int count1=0;
        while(num>0){
            count1++;
            num/=10;
        }
        return count1;
    }
    public static void rotate(int num,int k){
        int len=count(num);
        if(k>=0) {
            for (int i = 1; i <= k; i++) {
                int ld = num % 10;
                num = num / 10;
                num = (ld * (int) Math.pow(10, len-1)) + num;
            }
        }else{
            for(int i=-1;i>=k;i--){
                int fd=num/(int) Math.pow(10, len-1);
                num=num%(int) Math.pow(10, len-1);
                num=(num*10)+fd;

            }
        }
        System.out.println("The Roataion of the number is : "+num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whom  you want to rotate : ");
        int num=sc.nextInt();
        System.out.print("Enter how many times you want to rotate : ");
        int k=sc.nextInt();
        rotate(num,k);



    }
}
