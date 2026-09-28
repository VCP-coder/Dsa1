class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t_sum=threshold*k;
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=t_sum){
            count++;
        }

        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>=t_sum){
                count++;
            }
        }
    return count;
    }
}