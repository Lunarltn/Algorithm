import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100 - progresses[i]) / (float) speeds[i]));
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= current) {
                count++;
                queue.poll();
            }
            list.add(count);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}