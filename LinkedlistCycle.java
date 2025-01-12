/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = value;
  }
}*/

class Solution {

  public boolean hasCycle(ListNode head) {
    // TODO: Write your code here
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow){
        return true;
      }
    }
    return false;
  }
}
