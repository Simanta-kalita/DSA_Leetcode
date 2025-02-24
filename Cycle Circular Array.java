class Solution {

  public boolean loopExists(int[] arr) {
    // TODO: Write your code here
    for(int i = 0; i < arr.length; i++){
      boolean isForward = arr[i] >= 0;
      int slow = i;
      int fast = i;

      do{
        slow = nextIndex(slow, arr, isForward);
        fast = nextIndex(fast, arr, isForward);
        if(fast != -1){
          fast = nextIndex(fast, arr, isForward);
        }
      } while(fast != -1 && slow != -1 && fast != slow);
      if(slow != -1 && slow == fast){
        return true;
      }
    }
    return false;
  }

  public static int nextIndex(int index, int[] arr, boolean isForward){
    boolean direction = arr[index] >= 0;
    if(isForward != direction){
      return -1;
    }

    int nextIndex = (index + arr[index]) % arr.length;

    if(nextIndex < 0){
      nextIndex += arr.length;
    }

    // one element loop
    if(nextIndex == index){
      return -1;
    }

    return nextIndex;
  }
}
