
public class AllocationMaximum {

    // Check whether maxPages is a possible solution
    public static boolean getMaximum(int[] arr, int k, int maxPages) {

        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pageSum + arr[i] <= maxPages) {
                // Current book can be assigned to current student
                pageSum += arr[i];
            } 
            else {

                // Current book cannot be assigned to current student
                studentCount++;

                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } 
                else {
                    // Assign current book to new student
                    pageSum = arr[i];
                }
            }
        }

        return true;
    }


    // Find minimum maximum pages
    public static int findPages(int[] arr, int k) {

        // If students are more than books
        if (arr.length < k) {
            return -1;
        }

        int sum = 0;

        // Calculate total pages
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int s = 1;
        int e = sum;
        int ans = -1;

        // Binary Search
        while (s <= e) {

            int mid = (s + e) / 2;

            if (getMaximum(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String args[]) {

        int[] arr = {10, 20, 30, 40};
        int k = 2;

        System.out.print(findPages(arr, k));
    }
}

























