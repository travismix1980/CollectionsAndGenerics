package Collections.Lesson2;

public class Vehicle {
    String make;
    String model;
    int price;
    boolean isFourWheelDrive;

    public Vehicle(String make, String model, int price, boolean isFourWheelDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.isFourWheelDrive = isFourWheelDrive;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() +
                "\nModel: " + getModel() +
                "\nPrice: $" + getPrice() +
                "\nFWD: " + isFourWheelDrive();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }
}
