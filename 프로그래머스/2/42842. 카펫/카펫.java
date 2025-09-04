class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = (brown - 4) / 2;
        int x = 0;
        for (int i = 1; i < sum; i++) {
            if (i * (sum - i) == yellow) {
                x = Math.max(i, sum - i);
                break;
            }
        }
        int[] answer = { x + 2, sum - x + 2 };        return answer;
    }
}