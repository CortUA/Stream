package Part2;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //  а, б, в, г, ґ, д, е, є, ж, з, и, і, ї, й, к, л, м, н, о, п, р, с, т, у, ф, х, ц, ч, ш, щ, ь, ю, я
        // Неймовірно складне завдання для людини яка не програмує.
        System.out.println("Введіть речення три рази будь ласка");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String[] ua = {"а", "е", "и", "і", "о", "у", "я", "ю", "є", "ї","А", "Е", "І", "О", "У", "Я", "Ю", "Є", "Ї"};
        for (int i = 0; i < ua.length; i++) {
            line = line.replace(ua[i], "");
        }

        System.out.println();
        System.out.println(line);

        String[] ua2 = {"б", "в", "г", "д", "ж", "з", "к", "л", "м", "н", "п", "р", "с", "т", "ґ", "ф", "х", "ц", "ч", "ш", "щ","Б",
                "Б", "В", "Г", "Д", "Ж", "З", "К", "Л", "М", "Н", "П", "Р", "С", "Т", "Ф", "Х", "Ц", "Ч", "Ш", "Щ"};
        for (int i = 0; i < ua2.length; i++) {
            line2 = line2.replace(ua2[i], "");
        }
        System.out.println();
        System.out.println(line2);

        String[] ua3 = {" "};
        for (int i = 0; i < ua3.length; i++) {
            line3 = line3.replace(ua3[i], "");
        }

        System.out.println();
        System.out.println(line3);
    }
}
//ready