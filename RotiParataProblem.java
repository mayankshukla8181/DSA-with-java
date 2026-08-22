public class RotiParataProblem {
    // Check whether we can make all parathas
    // within the given timeLimit
    static boolean isValidAns(int totalParathas, int[] cooks, int totalCooks, int timeLimit) {
                 int parathasCount = 0;
        // One by one, we will visit every cook
        for (int i = 0; i < totalCooks; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;
            // Start cooking
            while (timeTaken <= timeLimit) {
                timeTaken += currentCookRank * j;
                if (timeTaken <= timeLimit) {
                parathasCount++;
                j++;
                } 
                else {
                    // This cook cannot make another paratha
                    break;
                }
            }

            // Required parathas are already made
            if (parathasCount >= totalParathas) {
                return true;
            }
        }

        return false;
    }
    public static int parata(int[] cooks, int p) {
        
        int s = 0;
        int maxRank = cooks[cooks.length - 1];
        int e = maxRank * (p * (p + 1) / 2);
        int ans = -1;
        // Binary search
        while (s <= e) {
 int mid = s + (e - s) / 2;
            if (isValidAns(p, cooks, cooks.length, mid)) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] ranks = {1, 2, 3, 4};

        int p = 10;
        System.out.println(parata(ranks, p));
    }
}