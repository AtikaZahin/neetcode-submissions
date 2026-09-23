class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] o= new int[nums.length];
        int m=1;
        int j=0;
        for (int i:nums){
            if (i==0){
                j++;
            }else{
                m=m*i;
            }
        }
        for (int i=0;i<nums.length;i++){
            if (j>=2){
                o[i]=0;
            }else if (j==1){
                if (nums[i]==0){
                    o[i]=m;
                }else{
                    o[i]=0;
                }
            }else{
                o[i]=m/nums[i];
            }
        }

        return o;

    }
}  
