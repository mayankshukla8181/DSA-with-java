public class printArrayByRecursion{
    static void printArray (int arr[], int i){
    // case base 
    if(i>=arr.length){
    return;}
    System.out.println(arr[i]);
    // recursive call
    printArray(arr,i+1);
    System.out.println(arr[i-1]);   
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0;
         System.out.println("Elements of the array are:");
         printArray(arr,i);
    }
    }