package BinarySearch;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
 */

public class RecursiveBinarySearch {
    public int search(int[] nums, int target) {
       return recursiveBinarySearch(nums,0,nums.length-1,target);
    }
    public int recursiveBinarySearch(int [] nums, int left, int right, int target){

        int medium=(right+left)/2;
        if(right<left) return -1;
        if(target==nums[medium]) return medium;
        else if(target>nums[medium])
           return recursiveBinarySearch(nums,medium+1,right,target);

        else
          return recursiveBinarySearch(nums,left,medium-1,target);

    }

}
