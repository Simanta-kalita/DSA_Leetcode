class Solution {

  public boolean find(int num) {
    // TODO: Write your code here
    int slow = num;
    int fast = num;
    do {
      slow = squareSum(slow);
      fast = squareSum(squareSum(fast));
    } while (slow != fast) ;
    return slow == 1;
  }

  public static int squareSum(int num){
    int sum = 0, digit;
    while(num > 0){
      digit = num % 10;
      sum += digit * digit;
      num /= 10;
    }
    return sum;
  }
}
Happy Number.java
