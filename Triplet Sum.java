import java.util.*;

class Solution {

  public static List<List<Integer>> searchTriplets(int[] arr) {
    List<List<Integer>> triplets = new ArrayList<>();
    // TODO: Write your code here
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 2; i++){
      if(i > 0 && arr[i] == arr[i-1]){
        continue;
      }
      int left = i + 1;
      int right = arr.length - 1;
      while(left < right){
        int sum = arr[left] + arr[i] + arr[right];
        if(sum == 0){
            triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));
            left++;
            right--;
          while(left < right && arr[left - 1] == arr[left]){
            left++;
          }
          while(left < right && arr[right+1] == arr[right]){
            right--;
          }
        } else if(sum < 0){
          left++;
        } else {
          right--;
        }
      }
    }
    return triplets;
  }
}
