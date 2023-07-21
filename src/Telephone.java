public class Telephone extends Devices<Telephone>{
    private int batteryPower;
    private String color;

    public Telephone(double unitPrice, double discountRate, int stockAmount, String productName, Brand brand, int ram, int memory, double screenSize, int batteryPower, String color) {
        super(unitPrice, discountRate, stockAmount, productName, brand, ram, memory, screenSize);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
