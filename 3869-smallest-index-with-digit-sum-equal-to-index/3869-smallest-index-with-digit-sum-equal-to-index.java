class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int sum = 0;

            if (num == 0) {
                sum = 0;
            } else {
                while (num > 0) {
                    int rem = num%10;
                         sum = sum+ rem;
                    num = num / 10;
                }
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;
    }
}
