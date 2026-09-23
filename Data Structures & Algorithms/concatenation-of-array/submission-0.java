class Solution {
    public int[] getConcatenation(int[] nums) {
        int s = nums.length;
        int b=0;
        int [] a= new int[s*2];
        for (int i=0;i<s*2;i++){
            if (b==s){
                b=0;
            }
            a[i]=nums[b];
            b++;
        }
        return a;
    }
}