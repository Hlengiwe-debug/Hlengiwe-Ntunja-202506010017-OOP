// ==========================================
// PART 1: The Abstract Appliance Template
// ==========================================
     abstract class Appliance {
    protected String brand;

    // Fill in the blank for the constructor
    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        // Fill in the blank to print the brand
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Fill in the blank for the abstract method
    public abstract void operate();
}

// ==========================================
// PART 2: Activity 2 - Add TWO new appliance classes
// ==========================================

// 1. Washing Machine Class
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

// 2. Refrigerator Class
class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}