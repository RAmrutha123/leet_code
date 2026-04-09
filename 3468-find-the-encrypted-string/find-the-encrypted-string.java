class Solution {
    public String getEncryptedString(String s, int k) {
         int n=s.length();
        StringBuilder encrypted =new StringBuilder();
        for(int i=0;i<n;i++){
            int newindex=(i+k)%n;
            encrypted.append(s.charAt(newindex));

        }
        return encrypted.toString();
        
    }
}