/**
 * Link - https://leetcode.com/problems/combination-sum-ii/description/
 * 40. Combination Sum II
Solved
Medium
Topics
Companies
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
 */

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        subsets(ans,candidates,target,0,new ArrayList<>());
        return ans;
    }

    void subsets(List<List<Integer>> ans, int arr[],int target, int idx,List<Integer> list){
        if(idx>=arr.length){
            if(target==0)
                ans.add(new ArrayList<>(list));
            return;
        }
        if(target-arr[idx]>=0){
            list.add(arr[idx]);
            subsets(ans,arr,target-arr[idx],idx+1,list);
            list.remove(list.size()-1);
        }
        idx++;
        while(idx<arr.length && arr[idx-1]==arr[idx])
            idx++;
        subsets(ans,arr,target,idx,list);
    }
}