class Solution {
  public int mySqrt(int x) {
    // TODO: Write your code here
    if(x < 2) return x;

    int left = 2;
    int right = x/2;

    while(left <= right){
      int mid = left + ((right - left)/2);
      long num = (long)  mid * mid;

      if(num == x){
        return mid;
      }else if(num > x){
        right = mid - 1;;
      } else if(num < x){
        left = mid + 1;
      }
    }

    return (int) right;
  }
}
