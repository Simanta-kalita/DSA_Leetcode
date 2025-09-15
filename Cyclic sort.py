class Solution:
  def sort(self, nums):
    # TODO: Write your code here
    i = 0
    while i < len(nums):
      correctIndex = nums[i] - 1
      if i != correctIndex:
        # if nums[i] != nums[correctIndex]:
          nums[i], nums[correctIndex] = nums[correctIndex], nums[i]
      else:
          i += 1
    return nums
