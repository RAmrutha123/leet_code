class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise=0;
        int total=0;
        int n=distance.length;

        int s=Math.min(start,destination);
        int d=Math.max(start,destination);
        for(int i=0;i<n;i++){
            if(i>=s && i<d){ 
            clockwise+=distance[i];
            }
            total+=distance[i];
        }
        return Math.min(clockwise,total-clockwise);
    }
}