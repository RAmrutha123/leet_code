class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapple=0;
        for(int a:apple){
            totalapple+=a;
        }
        Arrays.sort(capacity);

        int boxesused=0;
        for(int i=capacity.length-1;i>=0;i--){
            totalapple-=capacity[i];
            boxesused++;
        if(totalapple<=0){
            return boxesused;
        }
           
        }
        return boxesused;
    }
}