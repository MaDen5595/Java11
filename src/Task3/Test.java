package Task3;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date birth = new Date();
        birth.setYear(102);
        birth.setMonth(7);
        birth.setDate(11);
        Student Matvey = new Student("Матвей","Матвеич","Самолётостроение",2,5,275,birth);
        System.out.println(Matvey.toString(1));
        System.out.println(Matvey.toString(2));
        System.out.println(Matvey.toString(3));
    }
}
