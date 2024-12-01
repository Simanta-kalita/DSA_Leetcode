class Solution {
  public boolean checkIfPangram(String sentence) {
    // TODO: Write your code here
    Set<Character> store = new HashSet<>();

    for(int i = 0; i < sentence.length(); i++){
      char currentChar = Character.toLowerCase(sentence.charAt(i)) ;

      if(Character.isLetter(currentChar)){
        store.add(currentChar);
      }
    }
    if(store.size() == 26) return true;
    return false;
  }
}
