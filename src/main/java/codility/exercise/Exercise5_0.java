package codility.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise5_0 {
    class Solution {
        private final int ENTRANCE_FEE = 2;
        private final int FIRST_COST = 3;
        private final int AFTER_COST = 4;

        public int solution(String E, String L) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm", Locale.KOREA);

            try {
                long diff = dateFormat.parse(L).getTime() - dateFormat.parse(E).getTime();
                Date date = new Date(diff);
                int calculatedHour = date.getHours();
                int calculatedMinute = date.getMinutes();
                return calcuateFee(calculatedHour, calculatedMinute);
            } catch (ParseException e) {
                return 0;
            }
        }

        public int calcuateFee(int hours, int minutes) {
            int resultFee = 0;

            if (hours >= 1) {
                if (minutes > 0) {
                    resultFee = ENTRANCE_FEE + FIRST_COST + (hours) * AFTER_COST;
                } else {
                    resultFee = ENTRANCE_FEE + FIRST_COST + (hours - 1) * AFTER_COST;
                }
            } else {
                resultFee = ENTRANCE_FEE + FIRST_COST;
            }
            return resultFee;
        }
    }
}
