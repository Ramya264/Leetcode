class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merged=new int[n+m];
        int c=0;
        for(int i=0;i<m;i++){
            merged[c++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merged[c++]=nums2[i];
        }
        Arrays.sort(merged);
        double number=0.0;
        for(int i=0;i<m+n;i++){
            if((m+n) % 2 == 0){
                int a=merged[(m+n)/2];
                int b=merged[((m+n)/2)-1];
                number=(a+b)/2.0;
            }
            else{
                number=merged[(m+n)/2];
            }
        }
        return number;
    }
}