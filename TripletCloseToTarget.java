import java.util.*;

class Solution {

  public int searchTriplet(int[] arr, int targetSum) {
    // TODO: Write your code here
    if(arr == null || arr.length < 3){
      throw new IllegalArgumentException();
    }
    Arrays.sort(arr);
    int minDistance = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length - 2; i++){{
      int left = i + 1;
      int right = arr.length - 1;
      while(left < right){
        int targetDiff = targetSum - arr[i] - arr[left] - arr[right];
        if(targetDiff == 0){
          return targetSum;
          }
          // Below 1st checks if absolute value is smaller
          // 2nd checks if equal value, then checks which one is a positive
        if(Math.abs(targetDiff) < Math.abs(minDistance) || 
        (Math.abs(targetDiff) == Math.abs(minDistance) && targetDiff > minDistance)){
          minDistance = targetDiff;
        }
        if(targetDiff > 0){
          left++;
        } else {
          right--;
        }
      }
    }}
    return targetSum - minDistance;
  }
}
