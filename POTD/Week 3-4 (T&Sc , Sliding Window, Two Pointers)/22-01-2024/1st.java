/**
 * Link - https://leetcode.com/problems/sort-array-by-parity-ii/description/
 * 922. Sort Array By Parity II
Solved
Easy
Topics
Companies
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 

Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
 */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[] = new int[nums.length];
        int idxEven=0, idxOdd=1;
        for(int i:nums){
            if(i%2==0){
                arr[idxEven] = i;
                idxEven+=2;
            }
            else{
                arr[idxOdd] = i;
                idxOdd+=2;
            }
        }
        return arr;
    }
}