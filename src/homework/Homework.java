package homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class Homework {
    /*
    Получить и вывести на экран:
    - текущую дату
    - текущий год, месяц и день
    - Создать дату , например день рождения и вывести на экран
    - Создать две даты и проверить на равенство
    - Получить и вывести на экран текущее время
    - текущее время + 3 часа
    Создать дату на неделю позже сегодняшней
    Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate birthday = LocalDate.of(1980,6,17);
        System.out.println(birthday);
        System.out.println(LocalDate.of(1980,6,17));

        LocalDate anyDate = LocalDate.of(2024, 1, 29);
        System.out.println(anyDate.isEqual(birthday));

        System.out.println(LocalTime.now());

        System.out.println(LocalTime.now().plusHours(3));

        LocalDate newDateWeekAfter = localDate.minusWeeks(1);
        System.out.println(newDateWeekAfter);

        LocalDate tomorow = LocalDate.of(2024,1,30);
        LocalDate yesterday = LocalDate.of(2024,1,15 );
        System.out.println(tomorow.isAfter(LocalDate.now()));
        System.out.println(yesterday.isBefore(LocalDate.now()));

    }
}
