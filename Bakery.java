
  public double getPrice() {
    return price;
  }

  /**
   * Returns the size of the product
   */
  public String getSize() {
    return size;
  }

  /**
   * Changes the name of the product
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Changes the price of the product
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Changes the size of the product
   */
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Returns the product's information as a String
   */
  public String toString() {
    return "Name: " + name + ", Price: $" + price + ", Size: " + size;
  }
}
