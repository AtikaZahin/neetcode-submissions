class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int i=0;
        int end = s.length()-1;
        while(i<end){

            if (!Character.isLetterOrDigit(a.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(a.charAt(end))){
                end --;
                continue;

            }if (a.charAt(i)!= a.charAt(end)){
                return false;
            }
            end--;
            i++;
        }
        return true;
    }
}
