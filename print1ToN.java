public class Print1ToN {

    static void print1toN(int n, int count) {
        if (count > n) {
            return;
        }

        System.out.println(count);
        print1toN(n, count + 1);
    }

    public static void main(String[] args) {
        print1toN(10, 1);
    }
}