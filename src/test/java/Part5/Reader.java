package Part5;

import java.sql.SQLOutput;

public class Reader {

   private int book;
   private int book1;
   private int book2;
   private String fio;
   private int phone;
   private int ticket;
   private int book3;

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getBook1() {
        return book1;
    }

    public void setBook1(int book1) {
        this.book1 = book1;
    }

    public int getBook2() {
        return book2;
    }

    public void setBook2(int book2) {
        this.book2 = book2;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getBook3() {
        return book3;
    }

    public void setBook3(int book3) {
        this.book3 = book3;
    }

    public void takeBooks(){
    if ((getBook() + getBook1()) <= 5){
        System.out.println("Читач взяв "+ getBook1() + " книжок і тепер у нього загалом "+ (getBook() + getBook1())+ " книг. Штрафу не передбачено" +
                "\n Повідомлення відправлено за номером телефону "+ getPhone());
    } else if ((getBook() + getBook1()) > 5){
        System.out.println("У читача "+ getFio()+ " з номером квитка "+ getTicket() + " - забагато книг - "+(getBook() + getBook1()) + " йому буде видано штраф "+ (getBook1()+getBook()-5)*50+ "гривень"+
                "\n Повідомлення відправлено за номером телефону "+ getPhone());
    }else {
        System.out.println("ви ввели невірні данні");
    }
}
public void returnBooks(){
    if((getBook3() - getBook2()) < 0){
        System.out.println("Неможливо повернути більше ніж отримав");
    }else if ((getBook3() - getBook2()) > 5) {
        System.out.println("Читач "+ getFio() +" повертає "+getBook2()+ " книжок. Але у нього забагато книжок на момент повернення, він отримав штраф "+ ((getBook3() - 5)*50 +" гривень"+
                "\n якщо він не поверне зайві книги то на наступний раз буде штраф "+((getBook3() - getBook2())-5)*50+ " гривень"+
                "\n Повідомлення відправлено за номером телефону "+ getPhone()));

        } else if (getBook3() > 5) {
        System.out.println("Наразі заборгованності нема. "+getFio()+" повернув "+ getBook2() +" книжки і тепер книжок менше 5." +
                "\n Але є штраф за зайві книги які взяв в минулому місяці - "+ (getBook3()-5)*50+ " гривень"+
                "\n Повідомлення відправлено за номером телефону "+ getPhone());
    }else {
        System.out.println("дякуємо що користуєтесь бібліотекою відповідально" + getFio()+
                "\n Повідомлення відправлено за номером телефону "+ getPhone());
    }
    }







    public static void main(String[] args) {
        Reader pasha = new Reader();
        pasha.setFio("Pasha");
        pasha.setTicket(865);
        pasha.setPhone(509896745);
        pasha.setBook(4);
        pasha.setBook1(5);
        pasha.setBook2(2);
        pasha.setBook3(pasha.getBook1()+ pasha.getBook());
        pasha.takeBooks();
        pasha.returnBooks();

        Reader ivan = new Reader();
        ivan.setFio("ivan ivanovich petrof");
        ivan.setTicket(345);
        ivan.setBook(4);
        ivan.setBook1(8);
        ivan.setBook2(9);
        ivan.setPhone(505957865);
        ivan.setBook3(ivan.getBook()+ ivan.getBook1());
        ivan.takeBooks();
        ivan.returnBooks();






    }
}




