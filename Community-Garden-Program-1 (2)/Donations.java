//*****************
// Donations class
//*****************
class Donations {
  private int amount;
  private double total;

  // constructor
  public Donations() {
    amount = 0;
    total = 0.0;
  }

  public void setAmount(int a) { amount = a; }
  public int getAmount() { return amount; }
  public void setTotal(double t) { total = t; }
  public double getTotal() { return total; }

  // calculate total
  public double calcSeeds() { return total = amount * 30; }
  public double calcSoil() { return total = amount * 15; }

  // ------------------------------------------
  // printBlockDono() - prints donation options
  // ------------------------------------------
  public void printBlockDono() {
    System.out.println("Before you leave, would you like to make a donation?");
    System.out.println("Please choose an option.");

    System.out.println("1. Seeds");
    System.out.println("2. Soil");
    System.out.println("3. Not right now");
    System.out.println();
  }
}