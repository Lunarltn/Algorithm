class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for (int i : arr) {
            answer = answer * i / gcd(answer, i);
        }

        return answer;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}