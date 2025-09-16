
#class Node:
#  def __init__(self, value, next=None):
#    self.val = value
#    self.next = next

class Solution:
  def reverse(self, head):
    result = None
    # TODO: Write your code here
    prev, current, next = None, head, None
    while current != None:
      next = current.next
      current.next = prev
      prev = current
      current = next

    result = prev

    return result
