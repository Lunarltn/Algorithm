import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clothMap = new HashMap<>();

        for (String[] cloth : clothes) {
            if (clothMap.containsKey(cloth[1]))
                clothMap.put(cloth[1], clothMap.get(cloth[1]) + 1);
            else
                clothMap.put(cloth[1], 1);
        }

        for (String key : clothMap.keySet()) {
            answer *= clothMap.get(key) + 1;
        }
        
        return answer-1;
    }
}