class Solution {
    public boolean isAnagram(String s, String t) {
        char []a = s.toCharArray();
        char []b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int l= s.length();
        if (l!=t.length()){
            return false;
        }
        for (int i=0;i<l;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
