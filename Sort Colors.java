import java.util.*;

public class educative_6 {
    public static int[] sortColors(int[] colors) {

        // Write your code here

        int start = 0;
        int current = 0;
        int end = colors.length - 1;

        while (current <= end) {
            if (colors[current] == 0) {
                colors[current] = colors[start];
                colors[start] = 0;
                start++;
                current++;
            } else if (colors[current] == 1) {
                current++;
            } else {
                colors[current] = colors[end];
                colors[end] = 2;
                end--;
            }
        }

        return colors;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                { 0, 1, 0 },
                { 1, 1, 0, 2 },
                { 2, 1, 1, 0, 0 },
                { 2, 2, 2, 0, 1, 0 },
                { 2, 1, 1, 0, 1, 0, 2 }
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));
        }
    }
}
