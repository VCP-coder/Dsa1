class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        mergeArray(nums1,nums2,ans);
        int size=ans.size();
        double sol=0;
        if(size %2 !=0){
            sol=ans.get(size/2);
        }
        else {
            return (ans.get(size / 2 - 1) + ans.get(size / 2)) / 2.0;
        }
    return sol;
    }
    public List<Integer> mergeArray(int arr1[],int arr2[],List<Integer> ans){
        int len1=arr1.length;
        int len2=arr2.length;
        int a1=0;
        int a2=0;
        while(a1<len1 && a2<len2){
            if(arr1[a1]<=arr2[a2]){
                ans.add(arr1[a1]);
                a1++;
            }
            else if(arr1[a1]>arr2[a2]){
                ans.add(arr2[a2]);
                a2++;
            }
        }
        while(a1<len1){
            ans.add(arr1[a1]);
            a1++;
        }
        while(a2<len2){
            ans.add(arr2[a2]);
            a2++;
        }
    return ans;
    }
}