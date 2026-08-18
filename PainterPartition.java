public class PainterPartition {

    static boolean isPossible(int[] boards, int n, int k, int mid) {

        int painterCount = 1;
        int boardLength = 0;

        for (int i = 0; i < n; i++) {

            // Current painter can paint this board
            if (boardLength + boards[i] <= mid) {
                boardLength += boards[i];
            } 
            else {
                // Assign this board to a new painter
                painterCount++;

                // This is important
                boardLength = boards[i];

                // More painters than allowed
                if (painterCount > k) {
                    return false;
                }
            }
        }

        return true;
    }

    static int findPages(int[] boards, int k) {

        int n = boards.length;

        int s = 0;
        int e = 0;

        // Minimum possible answer = largest board
        // Maximum possible answer = sum of all boards
        for (int board : boards) {
            s = Math.max(s, board);
            e += board;
        }

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isPossible(boards, n, k, mid)) {
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

        int[] boards = {10, 20, 30, 40};
        int k = 2;

        int ans = findPages(boards, k);

        System.out.println(ans);
    }
}