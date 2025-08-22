class Solution {
    public int[] solution(String[] wallpaper) {
                int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (minX > j)
                        minX = j;
                    if (minY > i)
                        minY = i;
                    if (maxX < j)
                        maxX = j;
                    if (maxY < i)
                        maxY = i;
                }
            }
        }
        int[] answer = { minY, minX, maxY + 1, maxX + 1 };
        return answer;
    }
}