class Solution {

  public static int sort(int[] arr) {
    // TODO: Write your code here
    int left = 0;
    int right = arr.length - 1;
    int minSubArray = Integer.MAX_VALUE;
    int maxSubArray = Integer.MIN_VALUE;

    while(left < arr.length - 1 && arr[left] <= arr[left + 1]){
      left++;
    }
    if(left == arr.length - 1){
      return 0;
    }
    while(right > 0 && arr[right] >= arr[right - 1]){
      right--;
    }

    for(int i = left; i <= right; i++){
      minSubArray = Math.min(minSubArray, arr[i]);
      maxSubArray = Math.max(maxSubArray, arr[i]);
    }

    while(left > 0 && arr[left - 1] > minSubArray){
      left--;
    }

    while(right < (arr.length - 1) && arr[right + 1] < maxSubArray){
      right++;
    }

    return right - left + 1;
  }
}
