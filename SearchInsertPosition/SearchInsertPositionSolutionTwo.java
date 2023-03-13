package SearchInsertPosition;

public class SearchInsertPositionSolutionTwo {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;


        while(left<=right){
            int medium=(right-left)/2;
            if(nums[medium]==target){
                return medium;
            }
            else if(nums[medium]<target){
                left=medium+1;
            }
            else{
                right=medium-1;
            }
        }
        return left;
    }
}
