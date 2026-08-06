public class BinarySearch {
   //static int GetLowerBound(int[] arr, int target) {
       
    //     int right = arr.length;
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int ans = -1;
    //     while (start < end) {
    //         int mid =  (end + start) / 2;
    //         if (arr[mid] < target) {
    //             start = mid + 1;
    //         } else {
    //             end = mid;
    //         }
    //     }
    //     return start;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 4, 4, 5, 6};
    //     int target = 4;
    //     int lowerBoundIndex = GetLowerBound(arr, target);
    //     System.out.println("Lower bound index of " + target + " is: " + lowerBoundIndex);
   // }
             static int GetUpperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
     static void main() {
        
        int[] arr = {10, 20, 40, 4, 5, 6};
        int target = 30;
        int upperBoundIndex = GetUpperBound(arr, target);
        System.out.println("Upper bound index of " + target + " is: " + upperBoundIndex);
    }
}