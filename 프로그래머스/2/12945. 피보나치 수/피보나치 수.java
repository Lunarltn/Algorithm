class Solution {
    public int solution(int n) {
        long[] temp = new long[n + 1];
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
            temp[i] = mod(temp[i - 1], temp[i - 2]);
        }

        return (int)temp[n];
    }
    private long mod(long l1, long l2) {
        return (l1 + l2) % 1234567;
    }
}