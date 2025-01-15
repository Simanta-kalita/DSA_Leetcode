/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = value;
  }
}*/

class Solution {

  public ListNode findMiddle(ListNode head) {
    ListNode slow = head;         // Initialize slow pointer at the head of the list
    ListNode fast = head;         // Initialize fast pointer at the head of the list
    while (fast != null && fast.next != null) {  // Traverse the list using slow and fast pointers
      slow = slow.next;          // Move slow pointer one step at a time
      fast = fast.next.next;     // Move fast pointer two steps at a time
    }

    return slow;  // Return the node pointed to by slow (middle node or middle-left node)
  }

}
