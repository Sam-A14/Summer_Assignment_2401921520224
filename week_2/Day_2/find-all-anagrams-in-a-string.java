class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] sfreq = new int[26];
        int [] pfreq = new int[26];
        int k = p.length();
        for(int i =0;i<k;i++){
            pfreq[p.charAt(i)-'a']++;
            sfreq[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sfreq,pfreq)){
             ans.add(0);
        }
        for(int right =k;right <s.length();right++){
           sfreq[s.charAt(right)-'a']++;
           sfreq[s.charAt(right-k)-'a']--;
           if(Arrays.equals(sfreq,pfreq)){
             ans.add(right-k+1);
           }
        }
        return ans;
    }
}
