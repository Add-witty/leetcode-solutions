class Solution {
    public int removeDuplicates(int[] nums) {
        int read = 1, write = 1, k=1;
        if(nums.length == 0)
        return 0;
        while (read < (nums.length )) {
            if (nums[read] == nums[write - 1])
                read++;
            else {
                nums[write] = nums[read];
                write++;
                read++;
                k++;
            }

        }
        return k;

    }
}