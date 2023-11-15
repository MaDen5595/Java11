package a11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int year, mounth, date, hours, minutes, secs;
    Calendar user = Calendar.getInstance();
        Date user2 = new Date();
    System.out.print("Введите год: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    year = sc.nextInt();
        System.out.print("Введите месяц: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    mounth = sc.nextInt();
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    date = sc.nextInt();
        System.out.print("Введите часы: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    hours = sc.nextInt();
        System.out.print("Введите минуты: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    minutes = sc.nextInt();
        System.out.print("Введите секунды: ");
        while (!sc.hasNextInt()) {
        System.out.print("Введите заново: ");
        sc.nextLine();
    }
    secs = sc.nextInt();
        user.set(Calendar.YEAR,year);
        user2.setYear(year-1900);
        switch(mounth){
        case(1) -> user.set(Calendar.MONTH,Calendar.JANUARY);
        case(2) -> user.set(Calendar.MONTH,Calendar.FEBRUARY);
        case(3) -> user.set(Calendar.MONTH,Calendar.MARCH);
        case(4) -> user.set(Calendar.MONTH,Calendar.APRIL);
        case(5) -> user.set(Calendar.MONTH,Calendar.MAY);
        case(6) -> user.set(Calendar.MONTH,Calendar.JUNE);
        case(7) -> user.set(Calendar.MONTH,Calendar.JULY);
        case(8) -> user.set(Calendar.MONTH,Calendar.AUGUST);
        case(9) -> user.set(Calendar.MONTH,Calendar.SEPTEMBER);
        case(10) -> user.set(Calendar.MONTH,Calendar.OCTOBER);
        case(11) -> user.set(Calendar.MONTH,Calendar.NOVEMBER);
        case(12) -> user.set(Calendar.MONTH,Calendar.DECEMBER);
    }
        user2.setMonth(mounth-1);
    user.set(Calendar.DAY_OF_MONTH,date);
    user2.setDate(date);
        user.set(Calendar.HOUR_OF_DAY,hours);
        user2.setHours(hours);
        user.set(Calendar.MINUTE,minutes);
        user2.setMinutes(minutes);
        user.set(Calendar.SECOND,secs);
        user2.setSeconds(secs);
        System.out.println(user.getTime());
        System.out.println(user2);
    }
}
