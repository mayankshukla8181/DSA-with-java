public class PrintDigitByReculsion {
    public static void main(String[] args) {
        int number = 12345;
        System.out.print("The digits of the number are: ");
        printDigits(number);
    }

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        printDigits(n / 10); // Recursive call with the number divided by 10
        System.out.print(n % 10 + " "); // Print the last digit
    }
}