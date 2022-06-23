public class Bus {

    int number;
    String color;
    double route;
    boolean atWork;

    public static void main(String[] args) {
        Bus sprinter = new Bus();
        sprinter.color = "red,";
        sprinter.number = 33;
        sprinter.route = 2.6;
        sprinter.atWork = true;

        System.out.println("\n the color of our bus - " + "" + sprinter.color +
                "\n number of the bus we need is " + " " + sprinter.number +
                "\n He is moving along the route " + " " + sprinter.route + ";" +
                "\n The electronic board will tell you if he is at work - " + sprinter.atWork + ";");


        Bus mersedes = new Bus();
        mersedes.color = "gray";
        mersedes.number = 45;
        mersedes.route = 134.1;
        mersedes.atWork = false;

        System.out.println("\n color of the new bus - " + mersedes.color +
                "\n his number - " + mersedes.number +
                "\n his route " + mersedes.route +
                "\n Working? " + mersedes.atWork
        );
    }
}