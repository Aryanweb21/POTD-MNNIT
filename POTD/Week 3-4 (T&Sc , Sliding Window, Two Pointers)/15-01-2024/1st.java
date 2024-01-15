/**
 * Link - https://leetcode.com/problems/two-sum/
 * 1. Two Sum
Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; // length of the array
        if(n==2) return new int[]{0,1}; // return{0,1} if n==2 because there must be at least 1 answer
        int ans[] = new int[2]; // array to store indices
        Map<Integer,Integer> map = new HashMap<>(); // HashMap to map integer,integer in key ,value pairs(key will be elements in nums[])
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            else
                map.put(nums[i],i);
        }
        return ans;
    }
}