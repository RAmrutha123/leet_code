class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> m=new HashSet<>();
        for(int x:nums){
            if(x>k){
                m.add(x);
            }
            else if(x<k){
                return -1;
            }
            
        }
        return m.size();
    }
}