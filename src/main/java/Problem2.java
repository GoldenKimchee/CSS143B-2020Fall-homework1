// Rearranges the array to ascending order (0, 1, 2, 3...)
public class Problem2 {

    public static void bubbleSort(int[] data) {
        int maxIndex = data.length;
        int temp;
        for (int j = 0; j < maxIndex - 1; j++) {          // Phases
            for (int i = 0; i < maxIndex - j - 1; i++) {  // Iterations
                if (data[i] > data[i + 1]) {              // Swap
                    temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
}
