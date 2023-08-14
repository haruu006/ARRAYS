There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.



  class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int a[]=new int[n];
        int b[]=new int[n];
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            a[i]=1;
            b[i]=1;
        }
        for(int i=1;i<n;i++){
           if(r[i]>r[i-1]){
             a[i]=(a[i-1]+1);
           }
        }
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                b[i]=(b[i+1]+1);
            }
        }
        int s=0;
        for(int i=0;i<n;i++){
            s+=Math.max(a[i],b[i]);
        }
        return s;
    }
}
