class Solution: 
    def decimalToBinary(self, num):
        # ToDo: Write Your Code Here.
        stack = []
        while num > 0:
            stack.append(num % 2)
            num = num//2
        return "".join(str(digit) for digit in reversed(stack))
