class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i)))
                answer += ' ';
            else {
                if (Character.isUpperCase(s.charAt(i)))
                    answer += (char) (((s.charAt(i) - 65 + n) % 26) + 65);
                else
                    answer += (char) (((s.charAt(i) - 97 + n) % 26) + 97);
            }
        }
        return answer;
    }
}