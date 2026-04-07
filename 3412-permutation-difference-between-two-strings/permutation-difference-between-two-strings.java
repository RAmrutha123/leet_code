class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
       for(int i=0;i<s.length();i++){
        char currentChar=s.charAt(i);
        for(int j=0;j<t.length();j++){
            if(currentChar==t.charAt(j)){
                 sum+=Math.abs(i-j);
                 break;
            }
        }

       }
       return sum;
        
    }
}