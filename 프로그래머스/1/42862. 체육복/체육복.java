import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n];
        Arrays.fill(students, 1);

        for (int l : lost) {
            students[l - 1]--;
        }
        for (int r : reserve) {
            students[r - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && students[i - 1] == 0 && students[i] > 1) {
                students[i]--;
                students[i - 1]++;
            }
            if (i + 1 < n && students[i + 1] == 0 && students[i] > 1) {
                students[i]--;
                students[i + 1]++;
            }
        }
        answer = (int) Arrays.stream(students).filter(x -> x > 0).count();


        return answer;
    }
}