class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;
        String answer = "Yes";

        for (int i = 0; i < goal.length; i++) {
            if (cards1Index < cards1.length && cards1[cards1Index].equals(goal[i]))
                cards1Index++;
            else if (cards2Index < cards2.length && cards2[cards2Index].equals(goal[i]))
                cards2Index++;
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}