import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        int i = 0;
        for (int s : score) {
            temp.add(s);

            if (temp.size() > k)
                temp.remove();
            answer[i++] = temp.peek();
        }

        return answer;
    }
}