class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower=new boolean[26],upper=new boolean[26];
        for(char c:word.toCharArray()){
            if(c>='a')
                lower[c-'a']=true;
            
            else
                upper[c-'A']=true;
        }
            int res=0;
            for(int i=0;i<26;i++)
                if(lower[i] && upper[i])
                    res++;
        return res;
    }
}