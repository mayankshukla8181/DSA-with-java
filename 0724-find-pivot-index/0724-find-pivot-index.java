class Solution {
    public int pivotIndex(int[] arr) {

//         int totalSum = 0;

//         // Calculate total sum
//         for (int num : nums) {
//             totalSum += num;
//         }

//         int leftSum = 0;

//         for (int i = 0; i < nums.length; i++) {

//             int rightSum = totalSum - leftSum - nums[i];

//             if (leftSum == rightSum) {
//                 return i;
//             }

//             leftSum += nums[i];
//         }

//         return -1;
//     }
// }
            
          int n = arr.length ;

   for(int i = 0; i <= n-1; i++){
    int left = 0;
    int right = 0;
     for(int j = 0 ; j < i; j++){
         left = left + arr[j];
          }
            for (int j  = i + 1; j < n; j++){
            right = right + arr[j];
           }
           if(right == left){
            return i;
           }
           
   }
   return -1; 
   }
    }




















































