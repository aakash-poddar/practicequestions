import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        System.out.println("reverse(str) = " + reverse(str));

    }
    static String reverse(String str){
        StringBuilder s = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
