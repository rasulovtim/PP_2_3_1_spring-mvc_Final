package web.model;

public class Car {
    private String model;
    private int year;
    private String price;

    public Car() {
    }

    public Car(String model, int year, String price) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
               "carModel='" + model + '\'' +
               ", year=" + year +
               ", price='" + price + '\'' +
               '}';
    }
}
