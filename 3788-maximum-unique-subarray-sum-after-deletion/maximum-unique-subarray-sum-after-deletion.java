class Solution {
    public int maxSum(int[] nums) {
        Set <Integer> st=new HashSet();
        for(int num:nums){
            st.add(num);
        }
        int ans=0;
        int minNeg=Integer.MIN_VALUE;

        for(int num:st){
            if(num>0){
                ans+=num;
            }
            else{
                minNeg=Math.max(minNeg, num);
            }
        }
        return ans!=0?ans:minNeg;
    }
}