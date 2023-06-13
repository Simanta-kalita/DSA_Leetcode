class Solution {
    public int longestPalindrome(String s) {
        int[] letterCount = new int[128];
        
        for(char ch: s.toCharArray()){
            letterCount[ch]++;
        }

        int result = 0;
        for(Integer count: letterCount){
            result += (count/2)*2;
            if(result % 2 == 0 && count % 2 == 1){
                result += 1;
            }
        }
        return result;
    }
}
