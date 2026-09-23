class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l =0
        r= len(heights)-1
        result=0
        while (l <r):
            res= min(heights[l],heights[r])* (r-l)
            result = max (result,res)
            if (heights[l]>heights[r]):
                r-=1
            else:
                l+=1
        return result