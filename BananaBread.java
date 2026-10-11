public class BananaBread extends Bakery {
  private boolean isChewy; //Whether the item is chewy or not

  // No argument constructor
  public BananaBread() {
    this(false, 3.5, "small");
  }

  // Parameterized constructor
  public BananaBread(boolean isChewy, double price, String size) {
    super(price, size);
    this.isChewy = isChewy;
  }

  // Accessor method
  public boolean isChewy() {
    return isChewy;
  }

  // Mutator method
  public void setChewy(boolean isChewy) {
    this.isChewy = isChewy;
  }

  // toString method
  public String toString() {
    return super.toString() + ", Chewy: " + isChewy;
  }
}
