package Week3;

public class Bottle {
    private String name;
    private String manufacturer; 
    /* private double total_energy; */
    private double size;
    private double price;

    public Bottle() {
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        size = 0.5;
        price = 1.80;
    }

    public Bottle(String _name, String _manuf, double _size, double _price) {
        name = _name;
        manufacturer = _manuf;
        size = _size;
        price = _price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;

    }
    public double getSize() {
        return size;
    }
   public double getPrice() {
        return price;
   }
    /* public double getEnergy() {
    }
    */
}