import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Pattern p1 = Pattern.compile("ayaaya|yeye|woowoo|mama");
        Pattern p2 = Pattern.compile("aya|ye|woo|ma");

        for (String s : babbling) {
            s = p1.matcher(s).replaceAll(" ");
            s = p2.matcher(s).replaceAll("");
            if (s.isEmpty())
                answer++;
        }
        return answer;
    }
}