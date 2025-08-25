import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        HashMap<String, Integer> termHashMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            termHashMap.put(term[0], Integer.valueOf(term[1]));
        }

        today = today.replace(".", "");

        for (int i = 0; i < privacies.length; i++) {
            String[] privacie = privacies[i].split(" ");
            privacie[0] = privacie[0].replace(".", "");

            LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.BASIC_ISO_DATE);
            LocalDate privacieDate = LocalDate.parse(privacie[0], DateTimeFormatter.BASIC_ISO_DATE);

            Period diff = Period.between(privacieDate, todayDate);

            if (termHashMap.get(privacie[1]) <= diff.getYears() * 12 + diff.getMonths())
                answerList.add(i + 1);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}