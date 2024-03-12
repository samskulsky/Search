public class SearchAlgorithms {

    // Linear search method
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    // Binary search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Return the index where the key is found
            }

            // If the key is greater, ignore the left half
            if (arr[mid] < key) {
                low = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if the key is not found
    }
}