/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = value;
  }
}*/

class Solution {

  public boolean isPalindrome(ListNode head) {
    // TODO: Write your code here
    if(head == null && head.next == null){
      return true;
    }

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode secondHalf = reverse(slow);
    ListNode secondHalfCopy = secondHalf;

    while(head != null && secondHalf != null){
      if(head.val != secondHalf.val){
        break;
      }
      head = head.next;
      secondHalf = secondHalf.next;
    }

    // reverse(secondHalfCopy);
    if(head == null || secondHalf == null){
      return true;
    }
    return false;
  }
 
  public static ListNode reverse(ListNode head){
    ListNode prev = null;
    while(head != null){
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}
