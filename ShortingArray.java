public class ShortingArray{
   static void bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void main(String args[]){
        int[] arr = {5, 2, 8, 3, 1};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
                       
                       
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    static void main(String args[]){
        int[] arr = {5, 2, 8, 3, 1};
        selectionSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
                      
                      static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // ab hamare pass khali jagah hai jaha curr ko insert karna hai
            arr[prev+1] = curr;
        }
    }
           static void main(String args[]){
        int[] arr = {5, 2, 8, 3, 1};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}