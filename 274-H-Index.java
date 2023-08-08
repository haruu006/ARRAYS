Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.

1) USING BINARY SEARCH METHOD -------TIME COMPLEXITY: O(NLOGN)
class Solution {
    public int hIndex(int[] citations) {
        int l=0,r=citations.length;
        while(l<r){
            int ct=0;
            int mid=(l+r+1)/2;
            for (int i=0;i<citations.length;i++){
                if(citations[i]>=mid){
                    ct++;
                }

            }
            if(ct>=mid){
                l=mid;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}
2) USING BUCKET SORT ---TIME COMPLEXITY: O(N)
  class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int bucket[]=new int[citations.length+1];
        for (int i=0;i<citations.length;i++){
            if(citations[i]>=n){
                bucket[n]++;
            }
            else{
                bucket[citations[i]]++;
            }
        }
        int c=0;
        for(int i=n;i>=0;i--){
            c+=bucket[i];
            if(c>=i){
                return i;
            }
        }
        return 0;
    }
}
