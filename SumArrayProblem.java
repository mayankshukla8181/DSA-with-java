public class SumArrayProblem {

    // Method to find the indices
    static int[] SumArray(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 9;

        int[] ans = SumArray(nums, target);

        if (ans.length == 2) {
            System.out.println("Indices: " + ans[0] + ", " + ans[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
