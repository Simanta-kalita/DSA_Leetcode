import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    // TODO: Write your code here
    if(s.length() != t.length()){
      return false;
    }
    Set<Character> store = new HashSet<Character>();
    for(int i =0; i < s.length(); i++){
      store.add(s.charAt(i));
    }

    for(int j = 0; j < t.length(); j++){
      if(!store.contains(t.charAt(j))){
        return false;
      }
    }

    return true;
  }
}
