import java.util.concurrent.atomic.AtomicInteger;

public abstract class Devices<T> implements IProduct{
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private String productName;
    private Brand brand;
    private int ram;
    private int memory;
    private double screenSize;

    public Devices(double unitPrice, double discountRate, int stockAmount, String productName, Brand brand, int ram, int memory, double screenSize) {
        this.id = UniqueIDGenerator.getUniqueID();
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brand = brand;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public class UniqueIDGenerator {
        private static final AtomicInteger counter = new AtomicInteger(0);

        public static int getUniqueID() {
            return counter.incrementAndGet();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String getBrand() {
        return brand.getBrandName();
    }

    @Override
    public void setBrand(String name) {

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public void setDiscount(double discount) {

    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
