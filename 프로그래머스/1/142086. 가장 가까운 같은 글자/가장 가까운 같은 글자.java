class Solution {
    public int[] solution(String s) {
        StringBuffer sb = new StringBuffer();
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().lastIndexOf(s.charAt(i)) == -1)
                answer[i] = -1;
            else
                answer[i] = i - sb.toString().lastIndexOf(s.charAt(i));

            sb.append(s.charAt(i));
        }
        return answer;
    }
}