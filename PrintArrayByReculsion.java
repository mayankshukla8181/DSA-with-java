public class PrintArrayByReculsion {
    static void print(int arr[], int i){
        if(i >= arr.length ){
            return;
        }
        else{
            System.out.println(arr[i]);
            print(arr, i+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr, 0);
    }
}