class Solution:
    def trap(self, height: List[int]) -> int:
        left=[]
        m=[]
        left.append(height[0])
        right=[0]*(len(height)-1)
        right.append(height[len(height)-1])
        sum=0
        j=len(height)-2
        for i in range (1,len(height)):
            left.append(max(height[i],left[i-1]))
            right[j]=(max(height[j],right[j+1]))
            j-=1
        for i in range (0,len(height)):
            m.append(min(left[i],right[i]))
            if (m[i]-height[i]>0):
                sum +=m[i]-height[i]
        return sum
