import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length()-1;


        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
