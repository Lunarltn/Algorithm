import java.util.Arrays;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String pattern = "1231";
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
            len++;
            if (ingredient[i] == 1 && len >= 4 && sb.substring(len - 4).equals(pattern)) {
                sb.delete(len - 4, len);
                len -= 4;
                answer++;
            }
        }
        return answer;
    }
}