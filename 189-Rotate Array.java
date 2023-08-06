Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Approach
Reverse the first n-k elements of the array. We can do this by swapping elements from the start and end of the subarray until we reach the middle.
Reverse the remaining k elements of the array. We can do this by swapping elements from the start and end of the subarray until we reach the middle.
Reverse the entire array. This is similar to step 1 but done on the whole array.
Complexity
Time complexity: O(n) where n is the number of elements in the array. The three reverse operations take linear time, and since all three operations are done separately, the overall time complexity remains linear.
Space complexity: O(1) since we are modifying the input array in-place and not using any additional space that depends on the size of the input.

TWO POINTER APPROACH FOR REVERSING ARRAY

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverseArr(nums,0,n-k-1);
        reverseArr(nums,n-k,n-1);
        reverseArr(nums,0,n-1);

    }
    public void reverseArr(int[] nums, int m,int n) {
        while(m<n){
            int temp=nums[n];
            nums[n]=nums[m];
            nums[m]=temp;
            m++;
            n--;
        }
    }    
}
