import java.util.*;

class Solution {
  public int findSubarrays(int[] nums, int target) {
    int totalCount = 0;

    if(target <= 1)
    return 0;

    // ToDo: Write Your Code Here.
    double product = 1;

    int left = 0;

    for(int right = 0; right < nums.length; right++){
        product *= nums[right];

        while(product >= target && left < nums.length){
          product /= nums[left];
          left++;
        }

        totalCount += right - left + 1;
    }

    // Return the result.
    return totalCount;
  }
}
