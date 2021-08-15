public class Product {

    private int id;
    private double price;
    private int discountRate;
    private int amountOfStock;
    private String productName;
    private Brand brand;

    public Product() {}

    public Product(int id, double price, int discountRate, int amountOfStock, String productName, Brand brand) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

class MobilePhone extends Product{

    private int storageCapacity; // gb
    private double screenSize; // inch
    private double cameraResolution;
    private int batteryPower; // mah
    private int ram; // gb
    private String color;

    public MobilePhone() {}

    public MobilePhone(int id, double price, int discountRate, int amountOfStock, String productName, Brand brand, int storageCapacity, double screenSize, double cameraResolution, int batteryPower, int ram, String color) {
        super(id, price, discountRate, amountOfStock, productName, brand);
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}

class Notebook extends Product{

    private int ram; //gb
    private int storageCapacity; //ssd - hdd gb
    private double screenSize; // inch

    public Notebook() {}

    public Notebook(int id, double price, int discountRate, int amountOfStock, String productName, Brand brand, int ram, int storageCapacity, double screenSize) {
        super(id, price, discountRate, amountOfStock, productName, brand);
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
