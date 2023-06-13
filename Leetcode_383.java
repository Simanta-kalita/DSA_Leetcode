class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        Arrays.fill(letters, 0);

        for(char ch: ransomNote.toCharArray()){
            letters[ch - 'a']++;
        }

        for(char c: magazine.toCharArray()){
            letters[c - 'a']--;
        }

        for(int i=0; i < letters.length; i++){
            if(letters[i] > 0) return false;
        }
        return true;
    }
}
