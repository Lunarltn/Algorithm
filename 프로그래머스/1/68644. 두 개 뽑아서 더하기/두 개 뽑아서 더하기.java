import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = temp.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}