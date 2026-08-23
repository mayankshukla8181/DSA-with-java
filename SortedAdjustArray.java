// this problem is done form by binary search 
public class SortedAdjustArray {
   public static int findElementInNearlySortedArray(int[] arr, int k) {
    int n = arr.length;
    int s = 0;
    int e = n -1;
    while(s <= e) {
        int mid = s + (e - s) / 2;
        if(arr[mid] == k) {
            return mid;
        }
        if(mid - 1 >= s && arr[mid - 1] == k) {
            return mid - 1;
        }
        if(mid + 1 <= e && arr[mid + 1] == k) {
            return mid + 1;
        }
        if(arr[mid] > k) {
            e = mid - 1;
        } else {
            s = mid + 1;
        }
    }
    return -1;
}
 public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = findElementInNearlySortedArray(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }
}