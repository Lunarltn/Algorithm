import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[][] students = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
        int[] studentCounts = { 0, 0, 0 };

        for (int i = 0; i < answers.length; i++) {
            if (students[0][i % students[0].length] == answers[i])
                studentCounts[0]++;
            if (students[1][i % students[1].length] == answers[i])
                studentCounts[1]++;
            if (students[2][i % students[2].length] == answers[i])
                studentCounts[2]++;
        }
        List<Integer> list = new ArrayList<>();

        int max = Arrays.stream(studentCounts).max().getAsInt();
        for (int i = 0; i < studentCounts.length; i++)
            if (max == studentCounts[i])
                list.add(i + 1);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}