class Solution {
    public int maxPower(String s) {
        int maxcount=1;
        int curcount=1;
        char[] arr=s.toCharArray();
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                curcount++;
            }
            else{
                curcount=1;
            }
            maxcount=Math.max(maxcount,curcount);
        }
        return maxcount;
    }
}