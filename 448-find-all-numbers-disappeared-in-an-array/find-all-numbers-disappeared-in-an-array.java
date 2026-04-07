class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            numSet.add(nums[j]);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!numSet.contains(i)){
             result.add(i);
            }
        }
        return result;
    }
}