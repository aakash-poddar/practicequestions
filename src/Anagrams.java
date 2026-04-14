import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        System.out.println("Enter a String");
        String s2 = sc.nextLine();
        System.out.println("isAnagram(s1,s2) = " + isAnagram(s1, s2));


    }

    static Boolean isAnagram(String s1 , String s2){
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int num : freq) {
            if (num != 0) return false;
        }

        return true;

    }
}
