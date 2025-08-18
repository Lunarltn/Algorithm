class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                int index = Integer.MAX_VALUE;
                for (int k = 0; k < keymap.length; k++) {
                    int temp = keymap[k].indexOf(targets[i].charAt(j));
                    if (temp > -1)
                        index = Math.min(index, temp);
                }
                if (index == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else
                    answer[i] += index + 1;
            }
        }
        return answer;
    }
}