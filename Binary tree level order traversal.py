from collections import deque


#class TreeNode:
#  def __init__(self, val):
#    self.val = val
#    self.left, self.right = None, None

class Solution:
  def traverse(self, root):
    result = []
    # TODO: Write your code here
    if root is None:
      return result
    queue = deque()
    queue.append(root)
    while queue:
     currentLevel = []
     queueLength = len(queue)
     for _ in range(queueLength):
      currentNode = queue.popleft()
      currentLevel.append(currentNode.val)
      if currentNode.left:
        queue.append(currentNode.left)
      if currentNode.right:
        queue.append(currentNode.right)
     result.append(currentLevel)
    return result
