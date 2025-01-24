/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = val;
  }
}*/

class Solution {

  public ListNode findCycleStart(ListNode head) {
    // TODO: Write your code here
    int cycleLength = 0;
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        cycleLength = findCycleLength(slow);
        break;
      }
    }
    return findStart(cycleLength, head);
  }

  public static int findCycleLength(ListNode slow){
    ListNode current = slow;
    int nodeCount = 0;
    do{
      current = current.next;
      nodeCount++;
    } while (current != slow);
    return nodeCount;
  }

  public static ListNode findStart(int cycleLength, ListNode head){
    ListNode first = head;
    ListNode second = head;

    while(cycleLength != 0){
      second = second.next;
      cycleLength--;
    }

    while(first != second){
      first = first.next;
      second = second.next;
    }
    return first;
  }


}
