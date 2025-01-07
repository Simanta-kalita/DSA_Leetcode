class Solution {

  public static boolean compare(String str1, String str2) {
    // TODO: Write your code here
    int index1 = str1.length() - 1; 
    int index2 = str2.length() - 1;
    while(index1 >= 0 && index2 >= 0){
      index1 = nextValidIndex(str1, index1);
      index2 = nextValidIndex(str2, index2);

      if(index1 < 0 && index2 < 0){
        return true;
      } else if(index1 < 0 || index2 < 0){
        return false;
      } else if(str1.charAt(index1) != str2.charAt(index2)){
        return false;
      }
      index1--;
      index2--;
    }
    return true;
  }

  private static int nextValidIndex(String str, int index){
    int backSpaceCount = 0;
    while(index >= 0){
      if(str.charAt(index) == '#'){
        backSpaceCount++;
      } else if(backSpaceCount > 0){
        backSpaceCount--;
      } else {
        break;
      }
      index--;
    }
    return index;
  }
}
