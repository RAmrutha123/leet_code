class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int x:nums){
            String s=Integer.toString(x);
        int maxdigit=0;
        for(char c:s.toCharArray()){
            maxdigit=Math.max(maxdigit,c-'0');
        }
        int encrt=0;
        for(int i=0;i<s.length();i++){
            encrt=encrt*10+maxdigit;
        }
        sum+=encrt;
        }
        return sum;
    }
}