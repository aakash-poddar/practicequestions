public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 10, 10};

        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
    }
}