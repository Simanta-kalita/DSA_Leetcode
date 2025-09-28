from collections import deque

#class TreeNode:
#  def __init__(self, val):
#    self.val = val
#    self.left, self.right = None, None

class Solution:
  def traverse(self, root):
    deq = deque()
    # TODO: Write your code here
    deq.append(root)
    result = deque()

    if root is None:
      return []

    while deq:
      currentLevel = []
      lengthLevel = len(deq)
      for _ in range(lengthLevel):
       currentNode = deq.popleft()
       currentLevel.append(currentNode.val)
       if currentNode.left:
        deq.append(currentNode.left)
       if currentNode.right:
        deq.append(currentNode.right)
      result.appendleft(currentLevel)
       
    return [list(subList) for subList in result]
