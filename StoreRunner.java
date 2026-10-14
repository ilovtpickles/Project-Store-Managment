
/**
 * Runs the bakery store program and displays different bakery products
 */
public class StoreRunner {

  /**
   * Creates bakery objects and prints their information
   */
  public static void main(String[] args) {

    // Create objects from the Bakery superclass
    Bakery item1 = new Bakery();
    Bakery item2 = new Bakery("Croissant", 2.5, "medium");

    // Create objects from the BananaBread subclass
    BananaBread banana1 = new BananaBread();
    BananaBread banana2 = new BananaBread(true, 4.5, "large");
    BananaBread banana3 = new BananaBread(false, 3.0, "medium");

    // Create objects from the SaltBread subclass
    SaltBread salt1 = new SaltBread();
    SaltBread salt2 = new SaltBread(true, 3.0, "medium");
    SaltBread salt3 = new SaltBread(false, 4.0, "large");

    // Print the information for all objects
    System.out.println(item1);
    System.out.println(item2);

    System.out.println(banana1);
    System.out.println(banana2);
    System.out.println(banana3);

    System.out.println(salt1);
    System.out.println(salt2);
    System.out.println(salt3);
  }
}
