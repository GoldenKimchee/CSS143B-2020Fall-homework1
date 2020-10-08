// Searches for the target number in the data array and returns the index where it is found, otherwise
//will return -1 when not found.
public class Problem1 {

    public static int binarySearch(int[] data, int target) {
        if (data == null || data.length == 0) {    // If null or there is nothing in the array,
            return -1;                             //then return -1 (target not found)
        }

        int low = 0;                    // Lowest integer
        int high = data.length - 1;     // Highest integer
        int middle;                     // Middle integer is initialized at line 16
        int match = -1;                 // If no match, returns -1

        while (low <= high) {                       // While there are items to check in list
            middle = (low + high) / 2;              // Recalculate middle
            if (data[middle] == target) {           // Returns middle index if its value matches target
                match = middle;
                break;

            } else if (data[middle] > target) {     // Resets new high when value at middle index is bigger than target
                high = middle - 1;

            } else {                                // Resets new low when value at middle index is smaller than target
                low = middle + 1;
            }
        }

        return match;
    }
}