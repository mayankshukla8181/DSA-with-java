class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left side is sorted
            if (nums[start] <= nums[mid]) {

                // Target is inside left side
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }
                // Target is in right side
                else {
                    start = mid + 1;
                }
            }

            // Right side is sorted
            else {

                // Target is inside right side
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                }
                // Target is in left side
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}