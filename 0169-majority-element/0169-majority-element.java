class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=nums[nums.length/2];
        return c;
    }
}
