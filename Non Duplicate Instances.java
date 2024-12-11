class Solution {

  public int moveElements(int[] arr) {
    // TODO: Write your code here
    int nextDuplicate = 1;

    for(int i = 1; i < arr.length; i++){
      if(arr[i] != arr[nextDuplicate - 1]){
        arr[nextDuplicate] = arr[i];
        nextDuplicate++;
      } 
    }

    return nextDuplicate;
  }
}
