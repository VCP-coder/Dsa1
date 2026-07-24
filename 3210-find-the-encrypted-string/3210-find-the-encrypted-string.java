class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        char arr[]=new char[s.length()];
        for(int i=0;i<n;i++){
            int index=(i+k)%n;
            arr[i]=s.charAt(index);
        }
    return new String(arr);
    }
}