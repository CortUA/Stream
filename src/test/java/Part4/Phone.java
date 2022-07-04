package Part4;

public class Phone {

    private int number;
    private String model;
    private double wight;
    String name;

    public void setNumber(int number) {
        this.number = number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWight(double wight) {
        this.wight = wight;

    }
    public int getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWight() {
        return wight;
    }

    public void receiveCall() {
        System.out.println("телефонує "+ name + " "+ getNumber());
    }

    public Phone(int number, String model, double wight) {
        this.number = number;
        this.model = model;
        this.wight = wight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
}
//ready
