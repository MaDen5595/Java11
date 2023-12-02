package a11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        LinkedList<String> two = new LinkedList<>();
        long startTime = System.nanoTime();
        one.add("Soprano");
        long estimatedTime = System.nanoTime() - startTime;
        long startTime2 = System.nanoTime();
        two.add("Soprano");
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Добавление в пустой список: Array: "+estimatedTime+", Linked: "+estimatedTime2);
        startTime = System.nanoTime();
        one.add(0, "aboba");
        estimatedTime = System.nanoTime() - startTime;
        startTime2 = System.nanoTime();
        two.add(0, "aboba");
        estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Вставка: Array: "+estimatedTime+", Linked: "+estimatedTime2);
        startTime = System.nanoTime();
        one.remove("aboba");
        estimatedTime = System.nanoTime() - startTime;
        startTime2 = System.nanoTime();
        two.remove("aboba");
        estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Удаление: Array: "+estimatedTime+", Linked: "+estimatedTime2);
        startTime = System.nanoTime();
        one.add("Heizenberg");
        estimatedTime = System.nanoTime() - startTime;
        startTime2 = System.nanoTime();
        two.add("Heizenberg");
        estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Добавление не в пустой список: Array: "+estimatedTime+", Linked: "+estimatedTime2);
        startTime = System.nanoTime();
        one.contains("Soprano");
        estimatedTime = System.nanoTime() - startTime;
        startTime2 = System.nanoTime();
        two.contains("Soprano");
        estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Поиск: Array: "+estimatedTime+", Linked: "+estimatedTime2);
    }
}
