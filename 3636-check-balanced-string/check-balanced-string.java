class Solution {
    public boolean isBalanced(String num) {
        int oddsum=0,evensum=0;
        char[] digits=num.toCharArray();
        for(int i=0;i<digits.length;i++){
           int val=digits[i]-'0';
            if(i%2==0){
                evensum+=val;
            }
            else{
                oddsum+=val;
            }
        }
        return evensum==oddsum;
    }
}