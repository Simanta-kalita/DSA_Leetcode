class Solution:
    def minAddToMakeValid(self, S: str) -> int:
        # ToDO: Write Your Code Here.
        no_of_unmatched_paranthesis = 0
        balance = 0

        for str in S:
            if str == '(':
                balance += 1
            else:
                balance -= 1
            
            if balance < 0:
                balance += 1
                no_of_unmatched_paranthesis += 1
        return balance + no_of_unmatched_paranthesis

