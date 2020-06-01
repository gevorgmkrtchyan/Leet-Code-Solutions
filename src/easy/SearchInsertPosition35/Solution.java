package easy.SearchInsertPosition35;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 * Examples --> Input [1,3,5,6], 5
 *              Output 2
 *              Input [1,3,5,6], 2
 *              Output 1
 *
 * @author Gevorg Mkrtchyan
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if(target > nums [i]) index++;
        }
        return index;
    }
}