class Solution:

    def countSubstrings(self, s: str) -> int:
        n = len(s)
        count = 0

        def no_of_palindromes(length: int, left: int, right: int):
          nonlocal count
          while left >= 0 and right <= length - 1 and s[left] == s[right]:
            count += 1
            left -= 1
            right += 1

        for i in range(n):
            # odd
            no_of_palindromes(len(s), i, i)

            #even
            no_of_palindromes(len(s), i, i+1)


        return count

        
