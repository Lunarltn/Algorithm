import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String, Integer> playerHashMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerHashMap.put(players[i], i);
        }

        for (String call : callings) {
            int value = playerHashMap.get(call);
            if (value == 0)
                continue;

            String name = answer[value - 1];

            answer[value - 1] = answer[value];
            playerHashMap.put(answer[value - 1], value - 1);

            answer[value] = name;
            playerHashMap.put(answer[value], value);
        }
        return answer;
    }
}