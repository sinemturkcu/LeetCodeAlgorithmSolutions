package SearchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        if(nums.length==0){
            return -1;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                return i;
            }
        }
       return nums.length;
    }
}
