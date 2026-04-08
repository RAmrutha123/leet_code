class Solution {
    public String getSmallestString(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
             int cur=arr[i]-'0';
             int next=arr[i+1]-'0';
             if(cur%2 == next%2){
                if(cur>next){
                char temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

                return new String(arr);
                }
             }
        }
        return s;
    }
}