class Solution:
    def isValid(self, s):
        # ToDo: Write Your Code Here.
        charStack = []

        for ch in s:
            if ch in ['(', '{','[']:
                charStack.append(ch)
            else:
              if not charStack:
                return False

              top = charStack.pop()

              if ch == ')' and top != '(' :
                return False

              if ch == ']' and top != '[':
                return False

              if ch == '}' and top != '{':
                return False
                
        return not charStack
