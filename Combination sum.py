class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        def backtrack( i, current, total):
            if i >= len(candidates) or total > target:
                return

            if total == target:
                res.append(list(current))
                return
            
            # case 1
            current.append(candidates[i])
            backtrack(i, current, total + candidates[i])
            current.pop()

            # case 2
            backtrack(i+1, current, total)

        backtrack(0, [], 0)
        return res
