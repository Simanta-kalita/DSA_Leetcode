import java.util.*;

class Solution {

  public List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    // TODO: Write your code here
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 3; i++){
      if(i > 0 && arr[i] == arr[i-1]){
        continue;
      }
      for(int j = i + 1; j < arr.length - 2; j++){
        if(j > i + 1 && arr[j] == arr[j - 1]){
          continue;
        }
        int left = j + 1;
        int right = arr.length - 1;

        while(left < right){
          int res = target - arr[i] - arr[j] - arr[left] - arr[right];
          if(res == 0){
            quadruplets.add(Arrays.asList(arr[i], arr[left], arr[right], arr[j]));
            left++;
            right--;
            while(left < right && arr[left] == arr[left - 1]){
              left++;
            }
            while(left < right && arr[right] == arr[right + 1]){
              right--;
            }
          } else if(res > 0){
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return quadruplets;
  }
}
