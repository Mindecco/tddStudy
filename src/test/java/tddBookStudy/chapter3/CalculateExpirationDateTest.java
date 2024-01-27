package tddBookStudy.chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculateExpirationDateTest {

    @Test
    void 만원을_납입하여_만료일계산(){
        calculDate(LocalDate.of(2023,01,25),10000,LocalDate.of(2023,02,25));
        calculDate(LocalDate.of(2023,01,31),10000,LocalDate.of(2023,02,28));
        calculDate(LocalDate.of(2023,05,31),10000,LocalDate.of(2023,06,30));
    }

    @Test
    void 입력말일과_다음달말일이_불일치한_경우(){
        calculDate(LocalDate.of(2023,05,31),10000,LocalDate.of(2023,06,30));
        calculDate(LocalDate.of(2024,01,31),10000,LocalDate.of(2024,02,29));
        calculDate(LocalDate.of(2024,01,31),30000,LocalDate.of(2024,04,30));

    }
    @Test
    void 이개월_이상납입(){
        calculDate(LocalDate.of(2023,01,31),20000,LocalDate.of(2023,3,31));
        calculDate(LocalDate.of(2023,01,30),70000,LocalDate.of(2023,8,30));
    }


    @Test
    void 돈이_모자라서_결제실패(){
        calculDate(LocalDate.of(2023,01,25),8000,LocalDate.of(2023,1,25));
        calculDate(LocalDate.of(2023,01,30),4000,LocalDate.of(2023,1,30));
    }

    @Test
    void 십만원_결제로_일년제공(){
        calculDate(LocalDate.of(2023,01,25),100000,LocalDate.of(2024,1,25));
        calculDate(LocalDate.of(2023,02,28),100000,LocalDate.of(2024,2,28));
    }

    @Test
    void 십만원초과_결제(){
        calculDate(LocalDate.of(2023,01,25),110000,LocalDate.of(2024,2,25));
        calculDate(LocalDate.of(2024,02,29),200000,LocalDate.of(2026,2,28));
        calculDate(LocalDate.of(2024,02,29),570000,LocalDate.of(2029,9,29));

    }

//    @Test
//    void 이십만원_결제로_2년제공(){
//        LocalDate date = LocalDate.now();
//        CalculateExpirationDate calculateExpirationDate = new CalculateExpirationDate();
//        Assertions.assertEquals(date.plusMonths(24),calculateExpirationDate.calculateDate(200000));
//    }

    void calculDate(LocalDate startDate, int money,LocalDate endDate){
        CalculateExpirationDate calculateExpirationDate = new CalculateExpirationDate();
        Assertions.assertEquals(endDate,calculateExpirationDate.calculateDate(startDate,money));
    }

}

