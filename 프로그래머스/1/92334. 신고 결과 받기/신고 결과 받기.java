import java.util.HashMap;
import java.util.HashSet;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportedIdList = new HashMap<>();
        HashMap<String, Integer> idMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idMap.put(id_list[i], i);
            reportedIdList.put(id_list[i], new HashSet<>());
        }

        for (String rep : report) {
            String[] reps = rep.split(" ");
            reportedIdList.get(reps[1]).add(reps[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = reportedIdList.get(id_list[i]);
            if (set.size() >= k) {
                for (String id : set) {
                    answer[idMap.get(id)]++;
                }
            }
        }
        return answer;
    }
}