import java.util.*;

class Solution {
    public int findLength(String str, int k) {
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        // TODO: Write your code here.
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
          char rightCh = str.charAt(windowEnd);
          freqMap.put(rightCh, freqMap.getOrDefault(rightCh, 0) + 1);
          while(freqMap.size() > k){
            char leftCh = str.charAt(windowStart);
            freqMap.put(leftCh, freqMap.getOrDefault(leftCh, 0) - 1);
            if(freqMap.get(leftCh) == 0){
              freqMap.remove(leftCh);
            }
            windowStart++;
          }
          maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
