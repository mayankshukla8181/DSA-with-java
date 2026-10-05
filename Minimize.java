public class Minimize {
    static int solve(int amount, int[] coins, int index) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (index >= coins.length) {
            return 0;
        }
        int includeKaAns = solve(amount - coins[index], coins, index);
        int excludeKaAns = solve(amount, coins, index + 1);
        int finalAns = includeKaAns + excludeKaAns;
        return finalAns;
    }

    public int change(int amount, int[] coins) {
        int index = 0;
        int ans = solve(amount, coins, index);
        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        Minimize solution = new Minimize();
        int result = solution.change(amount, coins);
        System.out.println("Number of ways to make change: " + result);
    }
}