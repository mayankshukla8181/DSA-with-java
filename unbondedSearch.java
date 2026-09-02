public class unbondedSearch {
    public static int unbondedSearch(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            // Check if the left half is sorted
            if (arr[s] <= arr[mid]) {
                // Target is in the left half
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else { // Right half is sorted
                // Target is in the right half
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = unbondedSearch(arr, target);
        System.out.println("Target found at index: " + result);
    }
}