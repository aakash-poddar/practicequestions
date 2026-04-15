import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = sc.nextLine();
        System.out.println("vowels(str) = " + vowels(str));
    }
    static int vowels(String str){
        int count = 0;
        boolean isVowel = false;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u' ){
                if (!isVowel){
                    count++ ;
                    isVowel = true;
                }else {
                    isVowel = false;
                }

            }
        }
        return count;
    }
}
