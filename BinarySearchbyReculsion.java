public class BinarySearchbyReculsion {
    static int findTarget(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;  // Target not found
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        }
         else if (arr[mid] > target) {
            return findTarget(arr, target, start, mid - 1); // Search in the left half
        } 
        else {
            return findTarget(arr, target, mid + 1, end); // Search in the right half
        }
    }   
             public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 8};
        int target = 5;
        int result = findTarget(numbers, target, 0, numbers.length - 1);
             }
}
