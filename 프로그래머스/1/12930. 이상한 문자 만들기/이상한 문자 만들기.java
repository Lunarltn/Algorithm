class Solution {
    public String solution(String input) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isSpaceChar(c)) {
                count = 0;
                stringBuilder.append(" ");
                continue;
            }
            if (count % 2 == 0)
                stringBuilder.append(Character.toUpperCase(input.charAt(i)));
            else
                stringBuilder.append(Character.toLowerCase(input.charAt(i)));
            count++;
        }
        return stringBuilder.toString();
    }
}