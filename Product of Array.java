import java.util.*;

public class educative_5 {

    public static int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        // filing the array with 1s to have a base value
        Arrays.fill(res, 1);

        // starting values of the variables
        int l = 0;
        int r = n - 1;
        int leftProduct = 1;
        int rightProduct = 1;

        while (l < n && r > -1) {
            // first, set the previous value in result and then only update the product
            // so that the previous value is presrnt in the urrent index
            res[l] *= leftProduct;
            leftProduct *= arr[l];

            res[r] *= rightProduct;
            rightProduct *= arr[r];

            l++;
            r--;
        }

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] inputList = {
                { 1, 5, 10 },
                { 3, 5, 0, -3, 1 },
                { 7, 8, 9, 10, 11 },
                { 2, -4, -8, -11, 11 },
                { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 4, 5 }
        };

        for (int i = 0; i < inputList.length; i++) {
            System.out.print((i + 1) + ".\tnums: " + Arrays.toString(inputList[i]) +
                    "\n\tres: " + Arrays.toString(productExceptSelf(inputList[i])) + "\n");
            System.out.println(new String(new char[100]).replace("\0", "-"));
        }
    }

}
