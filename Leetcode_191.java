class Solution {
    public int hammingWeight(int n) {
        int weight = 0;
        int helper = 1;
        for(int i = 0; i < 32; i++){
            if((n & helper) != 0){
                weight++;
            }
            helper = helper << 1;
        }
        return weight;
    }
}
