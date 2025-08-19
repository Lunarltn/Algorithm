class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
         for (char c : s.toCharArray()) {
            int skipCount = 0;
            for (int i = 0; i < index + skipCount; i++) {
                if (++c > 'z')
                    c = 'a';
                if (skip.contains(String.valueOf(c)))
                    skipCount++;
            }
            answer += c;
        }
        
        return answer;
    }
}