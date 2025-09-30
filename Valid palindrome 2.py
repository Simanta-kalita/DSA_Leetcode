class Solution:
    def isPalindromePossible(self, s: str) -> bool:
        # ToDo: Write Your Code Here.
        if len(s) == 0:
            return False
        left = 0
        right = len(s) - 1

        while left < right:
            if s[left] != s[right]:
                return self.isPalindrome(s, left + 1, right) or self.isPalindrome(s, left, right -1)
            left += 1
            right -= 1
        return True

    
    def isPalindrome(self, s: str, left: int, right: int) -> bool:
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True

