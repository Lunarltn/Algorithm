import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        while(n != 0){
            results.add(n % 3);
            n /= 3;
        }
        for(int i = results.size() - 1; i >= 0; i--){
            answer += results.get(i) * Math.pow(3, results.size() - i - 1);
        }
        return answer;
    }
}