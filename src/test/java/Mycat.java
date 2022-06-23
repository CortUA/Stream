


public class Mycat {

    int age;
    String name;
    String color;
    double weight;
    boolean living;
    static int count = 0;


    public static void main(String[] args) {
        Mycat prefix = new Mycat();
        prefix.name = "prefix";
        prefix.age = 5;
        prefix.weight = 4.6;
        prefix.living = true;
        count++;

        System.out.println('a');

        System.out.println("\n Мой Кот Префикс;"  +
                "\n "+ prefix.age+ " Его возраст; " +
                "\n " + prefix.name+" его Имя; " +
                "\n "+prefix.living+" состояние;" +"" +
                "\n " + prefix.weight+" kg его вес;" );

        Mycat sufix = new Mycat();

        sufix.name = "sufix";
        sufix.age = 3;
        sufix.weight = 3.93;
        sufix.living = true;
        count++;

        System.out.println("\n my cat is "+ sufix.name
        + "\n he is "+ sufix.age + " years old"
        + "\n He’s alive and it’s " + sufix.living
        + "\n growth of this cat "+ sufix.weight);

        Mycat raptor = new Mycat();
        raptor.color = "white";
        raptor.age = 2;
        raptor.weight = 2.3;
        raptor.name = "raptor";
        raptor.living = true;

        System.out.println("\n new cat" +
                "\n color - "+ raptor.color
        +"\n age - " + raptor.age
        +"\n weight - "+ raptor.weight
        +"\n name - " + raptor.name
        +"\n living - " + raptor.living);
        count++;


        System.out.println( "How many cats do I have? -  " + count);

    }




}
