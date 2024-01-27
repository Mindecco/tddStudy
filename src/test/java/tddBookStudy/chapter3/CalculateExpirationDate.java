package tddBookStudy.chapter3;

import java.time.LocalDate;

public class CalculateExpirationDate {
    public LocalDate calculateDate(LocalDate localDate, int money) {
        int plusMonth = money / 10000 ;
        int bonusCnt = plusMonth / 10;
        return localDate.plusMonths(plusMonth+bonusCnt*2);
    }
}
