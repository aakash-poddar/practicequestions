import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -2, 8, 7, 0, 3};
        int k = 10;

        findPairs(arr, k);
    }


    static void findPairs(int[] arr, int k) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (int num : arr) {
            int complement = k - num;

            if (set1.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);

                String pair = a + "," + b;

                if (!set2.contains(pair)) {
                    System.out.println("(" + a + ", " + b + ")");
                    set2.add(pair);
                }
            }

            set1.add(num);
        }
    }
}