class Solution {
    public int minimumChairs(String s) {
        int cur=0,max=0;
    for(char ch : s.toCharArray()){
        if(ch=='E'){
            cur++;
        }
        else{
            cur--;
        }
        if(cur>max){
            max=cur;
        }
        
    }
    return max;
        
    }
}