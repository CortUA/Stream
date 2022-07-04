package Part1;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month == 1) {
            System.out.println("Це Січень. У цьому місяці 31 день");
        } else if (month == 2) {
            System.out.println("Це Лютий. У цьому місяці 28 день");
        } else if (month == 3) {
            System.out.println("Це Березень. У цьому місяці 31 день");
        } else if (month == 4) {
            System.out.println("Це Квітень. У цьому місяці 30 день");
        } else if (month == 5) {
            System.out.println("Це Травень. У цьому місяці 31 день");
        } else if (month == 6) {
            System.out.println("Це Червень. У цьому місяці 30 день");
        } else if (month == 7) {
            System.out.println("Це Липень. У цьому місяці 31 день");
        } else if (month == 8) {
            System.out.println("Це Серпень. У цьому місяці 31 день");
        } else if (month == 9) {
            System.out.println("Це Вересень. У цьому місяці 30 день");
        } else if (month == 10) {
            System.out.println("Це Жовтень. У цьому місяці 31 день");
        } else if (month == 11) {
            System.out.println("Це Листопад. У цьому місяці 30 день");
        } else if (month == 12) {
            System.out.println("Це Грудень. У цьому місяці 31 день");
        }
        else {
            System.out.println("Вибачте, але треба ввести цифри від 1 до 12");
        }
    }
}
