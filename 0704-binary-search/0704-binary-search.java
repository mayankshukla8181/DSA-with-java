class Solution {
    public int search(int[] nums, int target) {
    int n = nums .length;
        int start = 0;
        int end = n-1;
        int mid = (end + start)/2;
         while(start<=end){
            // compare target by mid value
            if(nums[mid]== target){
                // target found
                return mid ;
            }
            else if(target > nums[mid]){
                // go to the right side
                start = mid + 1; 
            }
            else {
               // target < arr[mid]
               end = mid - 1;
            }
            mid = (start + end)/2;
         }
         // agar app yaha tk pahuch gye h iska mtlb yeh h ki target not found 
         return - 1;
        
    }
}