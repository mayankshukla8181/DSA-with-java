public class practise {
    public static int poweroftwo(int n) {
        if (n == 0) {
            return 1;
        }

        return 2 * poweroftwo(n - 1);
    }

    public static void main(String[] args) {

        int ans = poweroftwo(5);

        System.out.println("Power of two (5): " + ans);
    }
}