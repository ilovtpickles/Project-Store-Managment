
/**
 * Represents salt bread, a type of bakery product
 * Inherits the name, price, and size from the Bakery superclass
 */
public class SaltBread extends Bakery {

  private boolean buttery; // Whether the salt bread is buttery

  /**
   * No-argument constructor
   * Creates a small, non-buttery salt bread for $3.50
   */
  public SaltBread() {
    this(false, 3.5, "small");
  }

  /**
   * Parameterized constructor
   * @param buttery whether the salt bread is buttery
   * @param price the price of the salt bread
   * @param size the size of the salt bread
   */
  public SaltBread(boolean buttery, double price, String size) {
    super("Salt Bread", price, size);
    this.buttery = buttery;
  }

  /**
   * Returns whether the salt bread is buttery
   * @return true if buttery, false otherwise
   */
  public boolean isButtery() {
    return buttery;
  }

  /**
   * Changes whether the salt bread is buttery
   * @param buttery the new buttery value
   */
  public void setButtery(boolean buttery) {
    this.buttery = buttery;
  }

  /**
   * Returns the bakery information and buttery property
   * @return a String describing the salt bread
   */
  public String toString() {
    return super.toString() + ", Buttery: " + buttery;
  }
}
