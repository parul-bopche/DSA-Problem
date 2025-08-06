class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainingDays = n % 7;
        int total = 0;
        for (int i = 0; i < weeks; i++) {
            int start = i + 1;
            total += 7 * start + 21; 
        }

        int start = weeks + 1;
        for (int i = 0; i < remainingDays; i++) {
            total += start + i;
        }

        return total;
    }
}
