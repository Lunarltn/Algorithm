class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int subPoint = 4;
        int[] sc = { -3, -2, -1, 0, 1, 2, 3 };
        String[] types = { "RT", "CF", "JM", "AN" };
        String[] reverseTypes = { "TR", "FC", "MJ", "NA" };
        int[] point = { 0, 0, 0, 0 };
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (survey[i].equals(types[j])) {
                    point[j] += choices[i] - subPoint;
                    break;
                }
                if (survey[i].equals(reverseTypes[j])) {
                    point[j] -= choices[i] - subPoint;
                    break;
                }
            }
        }
        for (int i = 0; i < types.length; i++) {
            String temp = Character.toString(types[i].charAt(0));
            if (point[i] > 0)
                temp = Character.toString(types[i].charAt(1));
            answer += temp;
        }
        return answer;
    }
}