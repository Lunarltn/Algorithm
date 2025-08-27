class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = { 0, 0 };
        for (int i = 0; i < park.length; i++)
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }

        for (int i = 0; i < routes.length; i++) {
            int[] direction = { 0, 0 };
            switch (routes[i].charAt(0)) {
                case 'N':
                    direction[0] = -1;
                    break;
                case 'S':
                    direction[0] = 1;
                    break;
                case 'W':
                    direction[1] = -1;
                    break;
                case 'E':
                    direction[1] = 1;
                    break;
            }
            int repeat = routes[i].charAt(2) - '0';
            int[] next = answer.clone();
            for (int j = 0; j < repeat; j++) {
                next[0] += direction[0];
                next[1] += direction[1];
                if (next[0] < 0 || next[1] < 0 || next[0] >= park.length || next[1] >= park[0].length()
                        || park[next[0]].charAt(next[1]) == 'X') {
                    next = answer.clone();
                    break;
                }
            }
            answer = next.clone();
        }
        return answer;
    }
}