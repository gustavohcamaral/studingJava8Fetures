import java.time.*;
import java.time.format.DateTimeFormatter;


public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate catarFifaWorldCup = LocalDate.of(2022, Month.NOVEMBER, 21);

        int years = catarFifaWorldCup.getYear() - today.getYear();
        System.out.println(years);

        Period period = Period.between(today, catarFifaWorldCup);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        LocalDate nextWorldCup = catarFifaWorldCup.plusYears(4);
        System.out.println(catarFifaWorldCup);
        System.out.println(nextWorldCup);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedValue = catarFifaWorldCup.format(formatter);
        System.out.println(formattedValue);

        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(hourFormatter));

        DateTimeFormatter yearMonthFormatter = DateTimeFormatter.ofPattern("yyyy/MM");
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.format(yearMonthFormatter));

        LocalTime breakTime = LocalTime.of(15, 30);
        System.out.println(breakTime);
        //Exercises
        System.out.println("Exercises Start");
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        //
        LocalDate anyDay = LocalDate.of(2099,Month.JANUARY,25);
        System.out.println(anyDay);
        //
        Period questionPeriod = Period.between(todayDate, anyDay);
        //
        DateTimeFormatter brasilDateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(todayDate.format(brasilDateFormatter));
        System.out.println(brasilDateFormatter.format(todayDate));

        System.out.println("Exercise end");




    }
}