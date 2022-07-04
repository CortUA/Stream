package Part1;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println("Понеділок");
        } else if (day == 2) {
            System.out.println("Вівторок");
        } else if (day == 3) {
            System.out.println("Середа");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятниця");
        } else if (day == 6) {
            System.out.println("Вихідний");
        } else if (day == 7) {
            System.out.println("Вихідний");
        } else {
            System.out.println("Вибачте, але треба ввести цифри від 1 до 7");
        }
    }




}