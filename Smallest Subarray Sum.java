public class Solution {
  public int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    int subArrayStart = 0;
    int minLength = Integer.MAX_VALUE;
    int arraySum = 0;

    for(int subArrayEnd = 0; subArrayEnd < arr.length; subArrayEnd++){
      arraySum += arr[subArrayEnd];
      while(arraySum >= S){
        minLength = Math.min(minLength, subArrayEnd - subArrayStart + 1);
        arraySum -= arr[subArrayStart];
        subArrayStart++;
      }
    }
    return minLength < Integer.MAX_VALUE ? minLength : 0;
  }
}
