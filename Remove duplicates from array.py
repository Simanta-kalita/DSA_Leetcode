class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return -1
        
        write = 1
        
        for read in range(1, n):
            if nums[read] != nums[read - 1]:
                nums[write] = nums[read]
                write += 1
                
        return write
