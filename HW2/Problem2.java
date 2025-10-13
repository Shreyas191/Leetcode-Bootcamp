class Solution {
    public List<Integer> findAnagrams(String s, String p) {

         List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length())
            return ans;

        int scount[] = new int[26];
        int pcount[] = new int[26];
    
        for(int i = 0; i < p.length(); i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }

        if(Arrays.toString(pcount).equals(Arrays.toString(scount)))
            ans.add(0);

        for(int i = p.length(); i < s.length(); i++){
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(i-p.length())-'a']--;
            if(Arrays.toString(scount).equals(Arrays.toString(pcount)))
                ans.add(i-p.length()+1);
        }

        return ans;
    }
}