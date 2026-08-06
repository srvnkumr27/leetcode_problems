class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[slow - 1]) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;        
    }
}