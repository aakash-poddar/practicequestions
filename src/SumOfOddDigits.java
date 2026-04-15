import java.util.Scanner;

public class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("oddSum(num) = " + oddSum(num));

    }
    static int oddSum(int num){
        int sum  = 0;
        while (num > 0){
           int digit =  num % 10;
            if (digit % 2 != 0){
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }
}
