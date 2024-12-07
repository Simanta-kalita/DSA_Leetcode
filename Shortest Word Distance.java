class Solution {
  public int shortestDistance(String[] words, String word1, String word2) {
    // TODO: Write your code here
    int position1 = -1;
    int position2 = -1;
    int shortestDistance = words.length;

    for(int i = 0; i < words.length; i++){
      if(word1.equals(words[i])){
        position1 = i;
      }
      if(word2.equals(words[i])){
        position2 = i;
      }

      if(position1 != -1 && position2 != -1){
        shortestDistance = Math.min(shortestDistance, Math.abs(position1 - position2));
      }
    }

    return shortestDistance;
  }
}    
