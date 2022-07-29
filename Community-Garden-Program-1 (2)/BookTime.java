import java.util.*;

//**************************
// BookTime EXTENDS BookDay
//**************************
class BookTime extends BookMonth {
  private String time;

  // constructor
  public BookTime() {
    super();
    time = " ";
  }
  
  public void setTime(String t) { time = t; }
  public String getTime() { return time; }
  
  // ---------------------------------------
  // printTime() - prints time chosen 
  // ---------------------------------------
  public void print() {
    super.print();
    System.out.println("Time: " + time);
  }

  // ---------------------------------------
  // printBlockTime() - prints time options
  // ---------------------------------------
  public void printBlockTime(int input) {
    // times array
    String times[] = {" 8:00 AM", " 9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", " 1:00 PM", " 2:00 PM", " 3:00 PM", " 4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM"};
    
    if (input == 1 || input == 8 || input == 15 || input == 22 || input == 29) {
      Scanner i = new Scanner(System.in);
      System.out.println("The garden is not open on Sundays. Please make another selection.");
      int newInput = i.nextInt();
      this.printBlockTime(newInput);
    }
    else if (input == 7 || input == 14 || input == 21 || input == 28) {
      System.out.println("You chose a Saturday. Please pick from the times available.\n");
      for (int i = 0; i < times.length; i++) {
        System.out.println(i + 1 + ". " + times[i]);
        if (i == 9) 
          i = times.length;
      }
    }
    else {
      System.out.println("\nYou chose a weekday. Please pick from the times available.\n");
      for (int i = 0; i < times.length; i++)
        System.out.println(i + 1 + ". " + times[i]);
    }
  }

  // ---------------------------------------
  // validateTime() - validates time chosen
  // ---------------------------------------
  public boolean validateTime(int d, int t) {
    // times array
    String times[] = {" 8:00 AM", " 9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", " 1:00 PM", " 2:00 PM", " 3:00 PM", " 4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM"};
    
    if (d == 7 || d == 14 || d == 21 || d == 28) {
      if (t < 1 || t > 10)
        return false;
    }
    else {
      if (t < 1 || t > 13)
        return false;
    }
    System.out.println(" ");
    this.setTime(times[t-1]);
    return true;
  }
}