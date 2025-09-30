class Solution:
    def findLongestChain(self, pairs):
        # ToDo: Write Your Code Here.
        pairs.sort(key=lambda x:x[1])

        maxLength = 0
        currentMax = float('-inf')

        for pair in pairs:
            if pair[0] > currentMax:
                maxLength += 1
                currentMax = pair[1]

        return maxLength  # Return the maximum chain length

