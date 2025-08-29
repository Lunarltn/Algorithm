import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public String solution(String s) {
    String answer = "";

        String[] strings = s.split(" ");
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        for (String string : strings) {
            Integer i = Integer.valueOf(string);
            maxpq.offer(i);
            minpq.offer(i);
        }
        answer = minpq.poll() + " " + maxpq.poll();        return answer;
    }
}