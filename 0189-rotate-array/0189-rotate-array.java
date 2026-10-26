class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] temp = new int[n];

        // Place each element in its new rotated position
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}