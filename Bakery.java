public class Bakery {
  private double price; //Price of the item 
  private String size; //Size of the item

  // No argument constructor
  public Bakery() {
    this(3.5, "small");
  }

  // Parameterized constructor
  public Bakery(double price, String size) {
    this.price = price;
    this.size = size;
  }

  // Accessor methods
  public double getPrice() {
    return price;
  }

  public String getSize() {
    return size;
  }

  // Mutator methods
  public void setPrice(double price) {
    this.price = price;
  }

  public void setSize(String size) {
    this.size = size;
  }

  // toString method
  public String toString() {
    return "Price: $" + price + ", Size: " + size;
  }
}
