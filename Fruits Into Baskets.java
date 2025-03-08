
import java.util.*;

class Solution {
    public int findLength(char[] arr) {
        int maxLength = 0;
        // TODO: Write your code here
        int windowStart = 0;
        Map<Character, Integer> store = new HashMap<>();

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            store.put(arr[windowEnd], store.getOrDefault(arr[windowEnd], 0) + 1);
            while(store.size() > 2){
                store.put(arr[windowStart], store.getOrDefault(arr[windowStart], 0) - 1);
                if(store.get(arr[windowStart]) == 0){
                    store.remove(arr[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
