//*******************
// UserDetails class
//*******************
public class UserDetails {
  protected String name;
  protected String phone;
  protected String email;

  // constructor
  public UserDetails() {
    name = " ";
    phone = "0";
    email = " ";
  }
  // overloaded constructor
  public UserDetails(String n, String p, String e) {
    name = n;
    phone = p;
    email = e;
  }
  
  public void setDetails(String n, String p, String e) {
    name = n;
    phone = p;
    email = e;
  }
  
  // ---------------------------------------
  // printDetails() - prints user details
  // ---------------------------------------
  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Phone Number: " + phone);
    System.out.println("E-Mail: " + email);
    System.out.println();
  }
}