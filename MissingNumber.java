public class MissingNumber {

    public static int MissingNumber(int[] num) {

        int xorSum = 0;
        int n = num.length;

        // XOR all elements of the array
        for (int value : num) {
            xorSum = xorSum ^ value;
        }

        // XOR with all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }

        // The remaining value is the missing number
        return xorSum;
    }

    public static void main(String[] args) {

        int[] num = {3, 0, 1};

        int ans = MissingNumber(num);

        System.out.println("Missing Number = " + ans);
    }
}
