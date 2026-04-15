import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        multiplicationTable(num);
    }

     static void multiplicationTable(int num) {

         for (int i = 0; i <= 10; i++) {
             if (i % 3 != 0){
                 System.out.println(num + " * " + i + " = " + num*i);
             }


         }
    }

}

