class Solution {
    public boolean isPalindrome(String s) { 
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int m = sb.length();
        for(int i = 0;i<m/2;i++){
            if(sb.charAt(i)!=sb.charAt(m-1-i)){
                return false;
            }
        }
        return true;
    }
}
