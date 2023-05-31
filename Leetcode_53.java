class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int sum = 0;

    for(int i =0; i< nums.length; i++){
        if(sum < 0){
            sum = 0;
        }

        sum = sum + nums[i];
        max_sum = Math.max(max_sum, sum);
    }
    return max_sum;
    }
}
