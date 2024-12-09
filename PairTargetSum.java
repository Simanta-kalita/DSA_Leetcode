class Solution {
  public static int[] search(int[] arr, int targetSum) {
    // TODO: Write your code here
    int left = 0;
    int right = arr.length - 1;

    while(left < right){
      int sum = arr[left] + arr[right];
      if(sum == targetSum){
        return new int[] {left, right};
      } else if(sum < targetSum){
        left++;
      } else {
        right--;
      }
    }
    return new int[] { -1, -1 };
  }
}
