import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++)
            wantMap.put(want[i], number[i]);

        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> dicountMap = new HashMap<>();

            for (int j = 0; j < 10; j++) {
                String key = discount[i + j];
                if (dicountMap.containsKey(key)) {
                    dicountMap.put(key, dicountMap.get(key) + 1);
                } else
                    dicountMap.put(key, 1);
            }

            boolean check = false;
            for (String key : wantMap.keySet()) {
                if (!dicountMap.containsKey(key) || wantMap.get(key) > dicountMap.get(key)) {
                    check = true;
                    break;
                }
            }
            if (!check)
                answer++;
        }
        return answer;
    }
}