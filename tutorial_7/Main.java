public class Main {
    public static void main(String[] args) {
        // LG Washing Machine
        WashingMachine wm = new WashingMachine("LG");
        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        // Empty line between outputs
        System.out.println();

        // Panasonic Refrigerator
        Refrigerator fridge = new Refrigerator("Panasonic");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
    }
}