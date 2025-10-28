class Solution:
    def trap(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        left_max, right_max = height[left], height[right]
        area = 0
        if not height:
            return 0

        while left < right:
            if left_max < right_max:
                left += 1
                left_max = max(left_max, height[left])
                area += left_max - height[left]
            else:
                right -= 1
                right_max = max(right_max, height[right])
                area += right_max - height[right]
        return area
