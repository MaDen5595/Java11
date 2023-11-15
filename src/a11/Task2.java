package a11;


import java.util.Calendar;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, mounth, date, hours, minutes, secs;
        Calendar currents = Calendar.getInstance();
        Calendar user = Calendar.getInstance();
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
        user.set(Calendar.DAY_OF_MONTH,date);
        user.set(Calendar.HOUR_OF_DAY,hours);
        user.set(Calendar.MINUTE,minutes);
        user.set(Calendar.SECOND,secs);
        if(user.compareTo(currents)<0){
            System.out.print("Ввеённая дата меньше");
        } else if (user.compareTo(currents)>0) {
            System.out.print("Ввеённая дата большше");
        }
        else{
            System.out.println("Даты одинаковы");
        }
    }
}
