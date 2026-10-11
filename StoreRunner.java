public class StoreRunner {
  public static void main(String[] args) {
    BananaBread banana = new BananaBread(true, 4.5, "large");
    SaltBread salt = new SaltBread(true, 3.0, "medium");

    System.out.println(banana);
    System.out.println(salt);
  }
}
