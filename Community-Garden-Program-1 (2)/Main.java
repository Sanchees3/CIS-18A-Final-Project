import java.util.*;

class Main extends BookTime {
  public static void main(String args[]) throws java.io.IOException {
      
    // declare objects & variables
    Scanner intInput = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    Scanner phone = new Scanner(System.in);
    Scanner email = new Scanner(System.in);
    boolean validT;  

    // friendly greeting
    System.out.println("****************************************************");
    System.out.println("Welcome to the Community Garden Appointment Service.");
    System.out.println("****************************************************");
    System.out.println();

    // ask for user details
    System.out.print("Full Name: ");
    String n = name.nextLine(); // get input
    System.out.print("Phone Number: ");
    String p = phone.nextLine();
    System.out.print("E-Mail: ");
    String e = email.nextLine();
    System.out.println();

    // create UserDetails object
    UserDetails user = new UserDetails(n, p, e);

    // create BookTime object
    BookTime appt = new BookTime();

    // **MONTH OPTIONS** //
    appt.printBlock();
    int inputMonth = intInput.nextInt(); // get input
    // validation (month)
    appt.validate(inputMonth);
      
    // **DAY OPTIONS** //
    appt.printBlockDay(inputMonth);
    System.out.println();
    int inputDay = intInput.nextInt();
    // validation (day)
    appt.validateDay(inputDay);
    
    // **TIME OPTIONS** //
    do {
    appt.printBlockTime(inputDay);
    int inputTime = intInput.nextInt();
    // validation (time)
    validT = appt.validateTime(inputDay, inputTime);
    } while (validT == false);

    // create donations object & total variable
    Donations d = new Donations();
    double total = 0.0;
    
    // output donation list & get input
    d.printBlockDono();
    int inputDono = intInput.nextInt();

    switch (inputDono) {
      case 1:
        System.out.println("Each pound of seeds is $30.00. How many pounds would you like to donate?");
        int numSeeds = intInput.nextInt();
        d.setAmount(numSeeds);
        total = d.calcSeeds();
        break;
      case 2:
        System.out.println("Each pound of soil is $15.00. How many pounds would you like to donate?");
        int numSoil = intInput.nextInt();
        d.setAmount(numSoil);
        total = d.calcSoil();
        break;
      case 3:
        System.out.println("Maybe next time!\n");
        break;
      default:
        System.out.println("Invalid input. Please try again.");
    }

    // display full appt and donation (if any)
    System.out.println("\nUser Details: ");
    user.printDetails();
    
    System.out.println("\nYou chose: ");
    appt.print();
    System.out.println("\nTotal Due: $" + total);
  }
}

