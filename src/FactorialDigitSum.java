import java.util.Scanner;

public class FactorialDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("factorialSum(num) = " + factorialSum(num));
//        System.out.println("factorial(num) = " + factorial(num));
    }

        static int factorial(int num) {
          if (num == 1) return 1;
          return num *  factorial(num - 1);

    }

    static int factorialSum(int num){
        int sum  = 0;
        int factorial = factorial(num);

        while (factorial > 0){
            int digit = factorial % 10;
            sum += digit;
            factorial /= 10;
        }
        return sum;

    }
}
