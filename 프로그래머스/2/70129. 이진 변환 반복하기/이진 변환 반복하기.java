class Solution {
    public int[] solution(String s) {
        int[] answer = { 0, 0 };

        while (s.length() > 1) {
            if (s.contains("0")) {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0')
                        count++;
                }
                answer[1] += count;
                s = s.replace("0", "");
            }
            answer[0]++;
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}