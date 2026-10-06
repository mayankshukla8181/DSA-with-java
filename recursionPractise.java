public class recursionPractise {

    // Recursive method to calculate sum from 1 to n
    public static int calculateSum(int n) {
        // Base Case: Stop when n drops to 0
        if (n <= 0) {
            return 0;
        }
        // Recursive Case: Add current n to the sum of (n - 1)
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calculateSum(number);
        System.out.println("Sum of numbers from 1 to " + number + " is: " + result); 
        // Output: 15 (5 + 4 + 3 + 2 + 1)
    }
}
