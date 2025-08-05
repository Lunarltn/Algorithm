class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;

        for (int s : section) {
            if (last < s) {
                answer++;
                last = s + m - 1;
            }
        }
        return answer;
    }
}