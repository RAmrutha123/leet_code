class Solution {
    public int[] minCosts(int[] cost) {
        for(int i=0;i<cost.length;i++){
            for(int j=i+1;j<cost.length;j++){
                 if(cost[i]<cost[i+1]){
                    cost[i+1]=cost[i];
                 }
            }
        }
        return cost;    
    }
}