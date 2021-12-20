package blog_lecture;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class TimeExmpl {
    public static void main(String[] args) {

        // LocalDate
        LocalDate now = LocalDate.now();
        LocalDate parisNow = LocalDate.now(ZoneId.of("Europe/Paris"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String formatedNow = now.format(formatter);

        System.out.println(now);
        System.out.println(formatedNow);
        System.out.println(parisNow);

        int year = now.getYear();
        String month = now.getMonth().toString();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int dayOfYear = now.getDayOfYear();
        String dayOfWeek = now.getDayOfWeek().toString();
        int dayOfWeekValue = now.getDayOfWeek().getValue();

        System.out.println(year);
        System.out.println(month + "(" + monthValue + ")");
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek + "(" + dayOfWeekValue + ")");

        // LocalTime
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String formatedNow2 = now2.format(formatter1);
        System.out.println(formatedNow2);

        int hour = now2.getHour();
        int minute = now2.getMinute();
        int second = now2.getSecond();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        // LocalDateTime
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3);
        String formatedNow3 = now3.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        System.out.println(formatedNow3);
    }
}
