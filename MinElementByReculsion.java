public class MinElementByReculsion {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int min = findMin(numbers, numbers.length);
        System.out.println("The minimum element is: " + min);
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}