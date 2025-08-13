class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        while (index < s.length()) {
            int w1 = 0, w2 = 0;
            for (int i = index; i < s.length(); i++) {
                if (s.charAt(index) == s.charAt(i))
                    w1++;
                else
                    w2++;

                if (w1 == w2) {
                    index = i + 1;
                    answer++;
                    break;
                }
            }
            if (w1 != w2) {
                answer++;
                break;
            }
        }
        return answer;
    }
}