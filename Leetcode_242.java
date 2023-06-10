class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        Arrays.fill(count, 0);

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char c: t.toCharArray()){
            count[c - 'a']--;
        }

        for(int i =0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
