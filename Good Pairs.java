class Solution {
  public int numGoodPairs(int[] nums) {
    int pairCount = 0;
    // TODO: Write your code here
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++){
      map.put(nums[i], map.getOrDefault(nums[i],0) + 1);

      pairCount += map.get(nums[i]) - 1;
    }

    return pairCount;
  }
}
