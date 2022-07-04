package Part4;

public class Run {
    public static void main(String[] args) {

        Phone lg = new Phone();

        Phone samsung = new Phone();

        Phone meizu = new Phone();

lg.setModel("Телефон");
lg.setNumber(0515656);
lg.setWight(45.2);
lg.name = "Ivan";

samsung.setNumber(153595);
samsung.setModel("samsung");
samsung.setWight(12.5);
samsung.name = "Grisha";

meizu.setModel("meizu");
meizu.setWight(11.5);
meizu.setNumber(1593566);
meizu.name = "Roma";




    System.out.println(lg.getNumber()+" "+lg.getModel()+" "+lg.getWight());
        System.out.println(samsung.getNumber()+" "+samsung.getModel()+" "+samsung.getWight());
        System.out.println(meizu.getNumber()+" "+meizu.getModel()+" "+meizu.getWight());

samsung.receiveCall();
meizu.receiveCall();
lg.receiveCall();



    }
}
