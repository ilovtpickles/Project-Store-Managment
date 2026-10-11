public class SaltBread extends Bakery {
  private boolean buttery; //Whether the item is buttery or not

  // No argument constructor
  public SaltBread() {
    this(false, 3.5, "small");
  }

  // Parameterized constructor
  public SaltBread(boolean buttery, double price, String size) {
    super(price, size);
    this.buttery = buttery;
  }

  // Accessor method
  public boolean isButtery() {
    return buttery;
  }

  // Mutator method
  public void setButtery(boolean buttery) {
    this.buttery = buttery;
  }

  // toString method
  public String toString() {
    return super.toString() + ", Buttery: " + buttery;
  }
}
