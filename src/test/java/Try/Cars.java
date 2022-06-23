package Try;

public class Cars {

    public String model;
    public int lpn;


    public Cars(String model, int lpn) {
        this.model = model;
        this.lpn = lpn;
    }
    public static void main(String[] args) {
        Cars cars = new Cars("Lancer", 6374);
        System.out.println(cars.model + " "+ cars.lpn);
    }
}
