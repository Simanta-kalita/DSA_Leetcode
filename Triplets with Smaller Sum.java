import java.util.*;

class Solution {

  public int searchTriplets(int[] arr, int target) {
    Arrays.sort(arr);
    int count = 0;
    // TODO: Write your code here
    for(int i = 0; i < arr.length - 2; i++){
      int left = i + 1;
      int right = arr.length - 1;
// [ 1, 2, 3, 4, 5] ->  1, -> 4 + 2 + 1 <- 5
      while(left < right){
        // for integer overflow, subtracting from target => target - (x+y+z) > 0
        int targetDiff = target - arr[i] - arr[left] - arr[right];          
        if(targetDiff > 0){
          count += right - left;
          // left increment so that we can find different range of pairs for every i, left, right
          left++;
        } else {
          right--;
        }
      }
    }

    return count;
  }
}
