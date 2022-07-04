package Part5;

import java.sql.SQLOutput;

public class Reader {

    int book;
    int book1;
    int book2;
    String fio;
    int phone;
    int ticket;



public void takeBooks(int book, int book1){
    if ((book + book1) <= 5){
        System.out.println("Читач взяв "+ book1 + " книжок і тепер у нього загалом "+ (book + book1)+ " книг. Штрафу не передбачено"   );
    } else if ((book + book1) > 5){
        System.out.println("У читача "+ fio + "забагато книг - "+(book + book1) + " йому буде видано штраф "+ (book1+book-5)*50+ "гривень");
    }else {
        System.out.println("ви ввели невірні данні");
    }
}
public void returnBooks(int book, int book2){
    if((book - book2) < 0){
        System.out.println("Неможливо повернути більше ніж отримав");
    }else if ((book - book2) > 5) {
        System.out.println("Читач"+ fio +" повертає "+book2+ "книжок. Але у нього забагато книжок на момент повернення, він отримує штраф "+ ((book - 5)*50 +" гривень"+
                "\n якщо він не поверне зайві книги то на наступний раз буде штраф "+((book - book2)-5)*50+ " гривень"));

        } else if (book > 5) {
        System.out.println("Наразі заборгованності нема. "+fio+" повернув "+ book2 +" книжки. Але є штраф за зайві книги які взяв в минулому місяці - "+ (book-5)*50+ " гривень");
    }else {
        System.out.println("дякуємо що користуєтесь бібліотекою відповідально" + fio);
    }
    }







    public static void main(String[] args) {
        Reader pasha = new Reader();
        pasha.fio = " PASHA ";
        pasha.takeBooks(4, 5);
        pasha.returnBooks(9, 2);

        Reader ivan = new Reader();
        ivan.fio = "Ivan";
        ivan.takeBooks(2,1);



    }
}




