import java.util.*;

class Solution {

  public List<List<Integer>> findSubarrays(int[] arr, int target) {
    List<List<Integer>> result = new ArrayList<>();
    // TODO: Write your code here

    long product = 1;
    int left = 0;

    for(int right = 0; right < arr.length; right++){
      product *= arr[right];

      while(left < arr.length && product >= target){
        product /= arr[left++];
      }

      List<Integer> tempList = new LinkedList<>();

      for(int i = right; i >= left; i--){
        tempList.add(0, arr[i]);
        result.add(new ArrayList<>(tempList));
      }
    }
    
    return result;
  }
}
