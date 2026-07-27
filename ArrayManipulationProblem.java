 import java.util.HashMap;
 import java.util.Arrays;
 public class ArrayManipulationProblem {
    

    static void ReverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        for (int k : arr) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseArray(arr);
    }
}
    static void ReverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        for (int k : arr) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseArray(arr);
    }

    static void shiftby1(int[] arr) {

        // Step 1: Store the last element
        int n = arr.length;
        int temp = arr[n - 1];

        // Step 2: Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Put the last element at index 0
        arr[0] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        shiftby1(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();
}
 
              
    

    Print alternate elements
    static void printAlternate(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (i == j) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
                System.out.print(arr[j] + " ");
            }

            i++;
            j--;
        }
        System.out.println();
    }

    // Find mode
    static int getMode(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        // Find key with maximum frequency
        for (int key : freq.keySet()) {

            int currentKeyFrequency = freq.get(key);

            if (currentKeyFrequency > maxFreq) {
                maxFreq = currentKeyFrequency;
                maxFreqWaliKey = key;
            }
        }

        return maxFreqWaliKey;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Alternate Printing:");
        printAlternate(arr1);

        int[] arr2 = {1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5};
        System.out.println("Mode = " + getMode(arr2));
    }




    static int[] getHighestLowestFreqElement(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Store frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find highest frequency element
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = key;
            }
        }

        // Find lowest frequency element
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = key;
            }
        }

        return new int[]{highestNum, lowestNum};
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5};

        int ans[] = getHighestLowestFreqElement(arr);

        System.out.println("Highest Frequency Element = " + ans[0]);
        System.out.println("Lowest Frequency Element = " + ans[1]);

        // Or print as an array
        System.out.println(Arrays.toString(ans));
    }

 