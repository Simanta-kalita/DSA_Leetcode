class Solution:
    def canJump(self, nums: List[int]) -> bool:
        totalLength = len(nums)
        farthest = 0

        for i in range(totalLength):
            if i > farthest:
                return False
            
            farthest = max(farthest, i + nums[i])

            if farthest >= (totalLength - 1):
                return True

        return farthest >= totalLength - 1
