public class maxElementRecusrion{
    static int findMax(int arr[], int i, int max) {
        // base case 
        if(i >= arr.length){
            return Integer.MIN_VALUE;
        }
            // phela case 
        if(arr[i]>= max){
          arr[i] = max;
        }
            // recursive call
            return findMax(arr,i+1,max);}
            
          
    
 public static void main(String[] args){
    int arr[] = {10, 20, 30, 40, 50};
    int i = 0;
    int max = findMax(arr, i, Integer.MIN_VALUE);
    System.out.println("Maximum element in the array is: " + max);
 }
}
