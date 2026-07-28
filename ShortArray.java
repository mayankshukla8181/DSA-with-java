public class ShortArray{

    public static int[] ShortArray(int[] num) {

        int i = 0;
        int j = num.length - 1;

        while (i < j) {

            if (num[i] == 1 && num[j] == 0) {
                // Swap
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                i++;
                j--;
            }

            if (num[i] == 0) {
                i++;
            }

            if (num[j] == 1) {
                j--;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        int[] num = {1, 0, 1, 0, 1, 0, 1};

        ShortArray(num);

        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
