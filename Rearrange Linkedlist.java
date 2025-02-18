/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = value;
  }
}*/

class Solution {

  public ListNode reorder(ListNode head) {
    // TODO: Write your code here
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode secondHalfHead = reverse(slow);
    ListNode firstNode = head;

    while(firstNode != null && secondHalfHead != null){
      ListNode temp = firstNode.next;
      firstNode.next = secondHalfHead;
      firstNode = temp;

      temp = secondHalfHead.next;
      secondHalfHead.next = firstNode;
      secondHalfHead = temp;
    }

    if(firstNode != null){
      firstNode.next = null;
    }

    return head;
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
