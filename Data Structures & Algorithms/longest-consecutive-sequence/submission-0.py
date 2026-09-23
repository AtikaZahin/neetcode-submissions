class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n= set(nums)
        longest =0
        for i in nums:
            length =0
            if (i-1) not in n: 
                while (i+length) in n:
                    length+=1
            longest = max(longest, length)

        return longest
