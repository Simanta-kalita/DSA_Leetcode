class Solution:
  def findMissingNumber(self, nums):
    n = len(nums)
    result = n
    # TODO: Write your code here
    i, k = 0, 0
    while i < n:
      j = nums[i]
      if nums[i] < n and nums[i] != nums[j]:
        nums[i], nums[j] = nums[j], nums[i]
      else:
        i += 1

        
    while k < n:
      if nums[k] != k:
        return k
      k += 1

    return n
