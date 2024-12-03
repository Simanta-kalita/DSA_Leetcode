public class Solution {
  public String reverseVowels(String s) {
    // TODO: Write your code here
    String vowels = "aeiouAEIOU";

    char[] strArray = s.toCharArray();
    int left = 0;
    int right = strArray.length - 1;

    while(left < right){
      while(left < right && (vowels.indexOf(strArray[left]) == -1)){
      left++;
    }
      while(left < right && (vowels.indexOf(strArray[right]) == -1)){
      right--;
    }
    char temp = strArray[left];
    strArray[left] = strArray[right];
    strArray[right] = temp;
    left++;
    right--;
    }

    return new String(strArray);
  }
}
