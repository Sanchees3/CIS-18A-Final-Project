//*****************
// BookMonth class
//*****************
class BookMonth implements Display, Validation {
  private String month;
  private int day;

  // constructor
  public BookMonth() { month = " "; }
  // overloaded constructor
  public BookMonth(String m) { month = m; }

  public void setMonth(String m) { month = m; }
  public String getMonth() { return month; }

  public void setDay(int d) { day = d; }
  public int getDay() { return day; }

  // ---------------------------------------
  // print() - prints month chosen
  // ---------------------------------------
  public void print() {
    System.out.println("Month: " + month);
    System.out.println("Day: " + day);
  }

  // ---------------------------------------
  // printBlock() - prints month options
  // ---------------------------------------
  public void printBlock() {
    String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };

    System.out.println("Please pick a month for your appointment.");
    System.out.println();
    for (int i = 0; i < months.length; i++) {
      System.out.println(i + 1 + ". " + months[i]);
    }
    System.out.println("Enter a number: ");
  }

  // ---------------------------------------
  // printBlockDay() - prints calendar per
  // month selected by user
  // ---------------------------------------
  public void printBlockDay(int input) {
    int months[][] = new int[12][];

    months[0] = new int[31]; // january
    months[1] = new int[28]; // february
    months[2] = new int[31]; // march
    months[3] = new int[30]; // april
    months[4] = new int[31]; // may
    months[5] = new int[30]; // june
    months[6] = new int[31]; // july
    months[7] = new int[31]; // august
    months[8] = new int[30]; // september
    months[9] = new int[31]; // october
    months[10] = new int[30]; // november
    months[11] = new int[31]; // december

    // output days for each month
    System.out.println("\nPlease pick a day for your appointment.");
    System.out.println();
    System.out.println("S  M  T  W  T  F  S");
    System.out.println("-------------------");

    int dayNum = 1;
    for (int i = 0; i < months[(input - 1)].length; i++) {
      // if day is one digit, add zero before it
      if (dayNum == 1 || dayNum == 2 || dayNum == 3 || dayNum == 4 || dayNum == 5 || dayNum == 6 || dayNum == 7 || dayNum == 8 || dayNum == 9) {
        System.out.print("0");
      }
      System.out.print(dayNum + " ");
      dayNum++;
      // break after every 7th day
      if (dayNum == 8 || dayNum == 15 || dayNum == 22 || dayNum == 29) {
        System.out.println();
      }
    }
  }

  // ---------------------------------------
  // validate() - validates month input
  // ---------------------------------------
  public void validate(int i) {
    String m;
    String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };

    if (i >= 1 && i <= 12) {
      m = months[i - 1];
      this.setMonth(m);
    } 
    else {
      System.out.println("Input Error. Try again.");
      System.exit(0);
    }
  }

  // ---------------------------------------
  // validateDay() - validates day input
  // ---------------------------------------
  public void validateDay(int i) {
    if (i >= 1 && i <= 31) {
      this.setDay(i);
    }
    else {
      System.out.println("Input Error. Try again.");
      System.exit(0);
    }
  }
}