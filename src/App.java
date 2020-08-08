import java.time.LocalDate;
import java.time.Period;

import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2002, 3, 13);
        int years = Period.between(birthDate, today).getYears();

        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);

        // how to calculate age from date of birth in java
    }
}
