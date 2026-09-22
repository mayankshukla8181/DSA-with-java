public class CountElementByReculsion {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int count = countElements(numbers, numbers.length);
        System.out.println("The number of elements is: " + count);
    }

    public static int countElements(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countElements(arr, n - 1);
    }
}