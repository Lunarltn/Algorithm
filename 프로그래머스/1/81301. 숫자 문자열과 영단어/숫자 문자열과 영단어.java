class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] filter = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < filter.length; i++) {
            s = s.replace(filter[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}