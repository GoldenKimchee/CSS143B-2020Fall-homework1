public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // If the null or there is nothing in the array, then return -1 (target not found)
        if (data == null || data.length == 0) {
            return -1;                  // If there is nothing in the list or null is inputed,
        }                               //-1 will be returned

        int low = 0;                    // Lowest integer is always 0 in sorted array
        int high = data.length - 1;     // Highest integer is one less than the length (for proper index)
        int middle;                     // Middle integer is initialized at line 16 to reduce redundancy
        int match = -1;                 // If there is no match in the array with the target, it will
                                        //simply return -1

        while (low <= high) {           // While there are still items to check in the list
            // Recalculate middle in every loop
            middle = (low + high) / 2;

            if (data[middle] == target) {           // If the value at the middle index matches target,
                match = middle;                     //then set equal to the returned index
                break;

            } else if (data[middle] > target) {     // If value at the middle index is too big, set the
                high = middle - 1;                  //new high index as the middle value - 1

            } else {                                // If value at the middle index is too small, set the
                low = middle + 1;                   //new low to the middle index + 1
            }
        }

        return match;
    }
}
