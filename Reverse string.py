class Solution:
    def reverseString(self, s):
       # ToDo: Write Your Code Here.
       stack = list(s)
       reversed_list = []

       while stack:
        reversed_list.append(stack.pop())
        
       return ''.join(reversed_list)


