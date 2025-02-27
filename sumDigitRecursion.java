public class sumDigitRecursion {
    public static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10+sumOfDigit(num/10);
        }
    }
    public static void main(String[] args) {
        int num=12345;
        System.out.println(sumOfDigit(num));
    }
}
