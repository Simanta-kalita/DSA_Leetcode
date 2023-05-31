class Solution {
    public int[] productExceptSelf(int[] nums) {

       if(nums.length == 0){
           return new int[0];
       }

        int prev = 1;
        int next = 1;
        int[] res = new int[nums.length];
        res[0] = prev;

        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                prev = prev * nums[i - 1];
                res[i] = prev;
            }
        }

        for(int j = nums.length -1; j >=0; j--){
            if( j != (nums.length -1)){
                next = next * nums[j+1];
                res[j] = res[j] * next;
            }
        }

        return res;
    }
}
