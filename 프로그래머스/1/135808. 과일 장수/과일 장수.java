import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length - 1; i > score.length % m; i -= m) {
            if (score[i - m + 1] > k)
                answer += k * m;
            else
                answer += score[i - m + 1] * m;
        }
        return answer;
    }
}