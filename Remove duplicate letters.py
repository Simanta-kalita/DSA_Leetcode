class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        # ToDo: Write Your Code Here.
        count = { char: s.count(char) for char in set(s) }
        resultStack = []
        present = set()

        for char in s:
            if char not in present:
              while resultStack and char < resultStack[-1] and count[resultStack[-1]] > 0:
                popped = resultStack.pop()
                present.remove(popped)

              resultStack.append(char)
              present.add(char)
            count[char] -= 1
        return ''.join(resultStack)


