
/**
 * Represents banana bread, a type of bakery product
 * Inherits the name, price, and size from the Bakery superclass
 */
public class BananaBread extends Bakery {

  private boolean isChewy;

  /**
   * No-argument constructor
   * Creates a small, non-chewy banana bread for $3.50
   */
  public BananaBread() {
    this(false, 3.5, "small");
  }

  /**
   * Parameterized constructor
   * @param isChewy whether the banana bread is chewy
   * @param price the price of the banana bread
   * @param size the size of the banana bread
   */
  public BananaBread(boolean isChewy, double price, String size) {
    super("Banana Bread", price, size);
    this.isChewy = isChewy;
  }

  /**
   * Returns whether the banana bread is chewy
   * @return true if chewy, false otherwise
   */
  public boolean isChewy() {
    return isChewy;
  }

  /**
   * Changes whether the banana bread is chewy
   * @param isChewy the new chewy value
   */
  public void setChewy(boolean isChewy) {
    this.isChewy = isChewy;
  }

  /**
   * Returns the bakery information and chewy property
   * @return a String describing the banana bread
   */
  public String toString() {
    return super.toString() + ", Chewy: " + isChewy;
  }
}
