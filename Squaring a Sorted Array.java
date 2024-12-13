class Solution {
  public static int[] makeSquares(int[] arr) {
    int n = arr.length;
    int[] squares = new int[n];
    int highestIndex = arr.length - 1;
    int left = 0;
    int right = arr.length - 1;
    while(left <= right){
      int leftSquare = arr[left]*arr[left];
      int rightSquare = arr[right]*arr[right];

      if(leftSquare < rightSquare){
        squares[highestIndex--] = rightSquare;
        right--; 
      } else {
        squares[highestIndex--] = leftSquare;
        left++;
      }
    }

    return squares;
  }
}
