import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int xc = X.length() - X.replace(String.valueOf(i), "").length();
            int yc = Y.length() - Y.replace(String.valueOf(i), "").length();
            for (int j = 0; j < Math.min(xc, yc); j++) {
                sb.append(i);
            }
        }
        if (sb.toString().isEmpty())
            answer = "-1";
        else if (sb.charAt(0) == '0')
            answer = "0";
        else
            answer = sb.toString();


        return answer;
    }
}