import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
            pq.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int currentIndex = queue.poll();
            int currentPriority = priorities[currentIndex];

            if (currentPriority == pq.peek()) {
                pq.poll();
                answer++;
                if (currentIndex == location)
                    break;
            } else {
                queue.add(currentIndex);
            }
        }
        return answer;
    }
}