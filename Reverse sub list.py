
#class Node:
#  def __init__(self, value, next=None):
#    self.val = value
#    self.next = next

class Solution:
  def reverse(self, head, p, q):
    # TODO: Write your code here
    current = head
    prev = None

    if p == q:
      return head
    
    i = 0
    while current is not None and i < p - 1:
      prev = current
      current = current.next
      i += 1

    last_node_first_list = prev
    last_node_rev_list = current

    i = 0
    while current is not None and i < q - p + 1:
      next = current.next
      current.next = prev
      prev = current
      current = next
      i += 1

    if last_node_first_list is not None:
      last_node_first_list.next = prev
    else:
      head = prev

    last_node_rev_list.next = current    

    return head
