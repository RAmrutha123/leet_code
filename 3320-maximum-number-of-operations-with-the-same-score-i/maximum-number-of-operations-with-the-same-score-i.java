class Solution {
    public int maxOperations(int[] nums) {
        int count=0;
        int sum=nums[0]+nums[1];
        int n=nums.length;
        for(int i=0;i+1<n;i+=2){
                if(nums[i]+nums[i+1]==sum){
                    count++;
                }
                else{
                    break;
                }
            }
        return count;
    }
}