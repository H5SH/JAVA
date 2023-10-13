class Vehicle{
    private String make, model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Make: " + make + ", Model: " + model + ", year: " + year + ", price: " + price;
    }
    
}

class Car extends Vehicle{
    private int numberOfDoors;
    private boolean electric = false;

    public Car(String make, String model, int year, double price, int numberOfDoors, boolean electric) {
        super(make, model, year, price);
        this.numberOfDoors = numberOfDoors;
        this.electric = electric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String toString(){
        return super.toString() + " number of Doors: " + numberOfDoors + ", electric: " + electric;
    }
    
}

class Question_4_70120545{
    public static void main(String argv[]){
        Car car1 = new Car("2009", "Honda City", 2009, 120000, 4, false);
        Car car2 = new Car("2012", "Carolla xli", 2012, 200000, 4, false);
        Vehicle vehicle1 = new Vehicle("2020", "Tesla", 2020, 500000);

        System.out.println("CAR 1: " + car1.toString());
        System.out.println("CAR 2: " + car2.toString());
        System.out.println("Vehicle: " + vehicle1.toString());
        // Car 1 price after discount
        System.out.println("Car 1 price after: " + (double)car1.getPrice() / 1.5);
        // Car 2 price after discount
        System.out.println("Car 1 price after: " + (double)car2.getPrice() / 1.7);
    }
}