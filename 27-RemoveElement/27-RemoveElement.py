# Last updated: 7/9/2026, 10:07:03 AM
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0  # index to place the next non-val element
        
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        
        return k
