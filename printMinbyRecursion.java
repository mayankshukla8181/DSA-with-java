public class printMinbyRecursion {

    static int findMin(int[] arr, int i, int min){
        // recusrive call
        if(i >= arr.length){
            return min;
        }
        // processing 
        if(arr[i]< min){
         min = arr[i];
        }
        // recursive call
        return findMin(arr,i+1,min);
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        int i = 0;
        int min = findMin(arr,i,Integer.MAX_VALUE);
        System.out.println("Minimum element in the array is: " + min);
    }
}