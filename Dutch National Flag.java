class Solution {
  public int[] sort(int[] arr) {
    // TODO: Write your code here
    int left = 0;
    int right = arr.length - 1;

    for(int i = 0; i <= right;){
      if(arr[i] == 0){
        swap(arr, i, left);
        left++;
        i++;
      } else if(arr[i] == 1){
        i++;
      } else {
        swap(arr, i, right);
        right--;
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
