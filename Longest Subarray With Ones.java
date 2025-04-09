
class Solution {
    public int findLength(int[] arr, int k) {
      int maxLength = 0;
      int windowStart = 0;
      int zeroCount = 0;
      // TODO: Write your code here
      for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
          if(arr[windowEnd] == 0){
            zeroCount++;
          }

          while(zeroCount > k){
            if(arr[windowStart] == 0){
              zeroCount--;
            }
            windowStart++;
          }

          maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
      return maxLength;
    }
}
