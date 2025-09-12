import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += elements[(i + j) % elements.length];
                set.add(sum);
            }
        }
        return set.size();
    }
}