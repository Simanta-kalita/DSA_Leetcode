class Solution {
  public boolean isPalindrome(String s) {
    // TODO: Write your code here
    char[] strArray = s.toCharArray();
    int left = 0;
    int right = strArray.length - 1;

    while(left < right){
      while(left < right && !Character.isLetterOrDigit(strArray[left])){
        left++;
      }

      while(left < right && !Character.isLetterOrDigit(strArray[right])){
        right--;
      }

      if(Character.toLowerCase(strArray[left]) != Character.toLowerCase(strArray[right])){
        return false;
      }
      left++;
      right--;
    }

    return true; 
  }
}
