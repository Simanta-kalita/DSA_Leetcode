class Solution {
    public boolean isPalindrome(String s) {
        String str = ""; 
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                str += ch;
            }
        }
        str = str.toLowerCase();
        int left_pointer =0;
        int right_pointer = str.length() - 1;
        
        while(left_pointer <= right_pointer){
            if(str.charAt(left_pointer) != str.charAt(right_pointer)){
                return false;
            }
            left_pointer += 1;
            right_pointer -= 1;
        }
        return true;
    }
}
