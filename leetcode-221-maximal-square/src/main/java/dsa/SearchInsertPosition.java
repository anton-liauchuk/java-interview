package dsa;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }

}
