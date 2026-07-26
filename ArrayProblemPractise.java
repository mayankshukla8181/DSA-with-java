public class ArrayProblemPractise {
    // static double getAverage(int[] arr){
    //     int sum = 0;
    //     for(int i :arr) {
    //          sum += i;
    //     }
            
    //     int size= arr.length;
    //     double avg = (double)sum/size;
    //     return avg;
    // }
    //   static void main(){
    //     int[] arr = {2, 4, 3, 3};

    //     System.out.print(getAverage(arr));
    //   }
   

//  static int[] multiplyBy10(int [] arr){
//     int size = arr.length;
//       int[] newArray = new int[size];

//     for(int i=0; i<size; i++) {
//         int element = arr[i];
//            element = element*10;
//           newArray[i] = element;
//     }
//     // return updated array
//     return newArray;
//         }

//         static void main(){
//         int arr[] = {1,2,3,4,5};
//         int[] ans = multiplyBy10(arr);
//         System.out.println("printing ans array");
//         for(int i:ans) {
//             System.out.println(i);
//         }
 
 
 
 
        // static boolean findTarget(int arr[] , int target){
        //     for(int i=0; i< arr.length; i++){
        //         if(arr[i]== target){
        //         return true;
        //     }
        // }
       
        //      //       agar pura loop tarvel kr chukah aur usko target nhi mila toh iska mtlb h target not present hai toph return false 
        //                   return false ;
        //      }
             
        //                       static void main(){
        //                         int arr[] = {1,2,3,4,5,7,};
        //                         boolean ans =findTarget(arr,7);
        //                          System.out.println(ans);
                       
    // static int getMaximum(int[] arr) {

    //     int maxi = arr[0];

    //     for (int i = 0; i < arr.length; i++) {

    //         if (arr[i] > maxi) {
    //             maxi = arr[i];
    //         }
    //     }

    //     return maxi;
    // }

    // public static void main(String[] args) {

    //     int[] arr = {1, 2, 3, 4, 5, 7};

    //     System.out.println(getMaximum(arr));
    // }

                 static int[] getPosNegSum(int arr[]){
                    int posSum = 0;
                    int negSum = 0;
                    for(int i=0; i<arr.length; i++){
                        if(arr[i] > 0){
                            // num is positive
                            posSum = positive + arr[i];

                        }
                        else{
                            // num is negitive 
                            negSum = negSum + arr[i];
                        }
                    }
                       int ans[] = {negSum, posSum};
                        return ans;
                        }
                        static void main() {
                            int arr[] = {2,-3,-4,-5,-7,9};
                        int ans[] = getPosNegSum(arr);
                        System.out.println("Positive Sum = " + ans[0]);
                        System.out.println("Negitive Sum = " + ans[1]);}
                
                       }
