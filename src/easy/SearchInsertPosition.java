package easy;

public class SearchInsertPosition {
    // Points learned:
    // The target value will always be on the left or right of the middle index, once the while loop ends.
    public static void main(String [] args) {
        int [] nums = {1};
        int target = 0;
        System.out.println(new SearchInsertPosition().searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1, mid = 0;

        while(left <= right) {
            mid = left + (right -left)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if(target > nums[mid])
            return (mid + 1);
        else
            return mid;
    }
}
