package easy;

public class BinarySearch {
//    Time Complexity https://www.geeksforgeeks.org/complexity-analysis-of-binary-search/

    public static void main(String [] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(new BinarySearch().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right) {
            int mid = left + (right -left)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
