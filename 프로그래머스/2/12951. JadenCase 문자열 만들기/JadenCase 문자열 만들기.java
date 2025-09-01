class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            Character pastC = s.charAt(i - 1);
            Character currentC = s.charAt(i);
            if (pastC == ' ') {
                currentC = Character.toUpperCase(currentC);
            } else
                currentC = Character.toLowerCase(currentC);
            sb.append(currentC);
        }
        return sb.toString();
    }
}