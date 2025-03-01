public class Solution {
  public int findMaxSumSubArray(int k, int[] arr) {
    // TODO: Write your code here
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    int subArrayStart = 0;
    for(int subArrayEnd = 0; subArrayEnd <  arr.length; subArrayEnd++){
      sum += arr[subArrayEnd];

      if(subArrayEnd >= k - 1){
        maxSum = Math.max(maxSum, sum);
        sum -= arr[subArrayStart];
        subArrayStart++;
      }
    }
    return maxSum;
  }      
}
