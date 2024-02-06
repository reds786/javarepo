// Create a Main class
public class Main1 {
  int x;  // Create a class attribute
  int y;

  // Create a class constructor for the Main class
  public  Main1(int z) {
    x = 100;  // Set the initial value for the class attribute x
    y = z; //Set the initial value for the class attribute y
  }

  public static void main(String[] args) {
    Main1 myObj = new Main1(10); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
    System.out.println(myObj.y);
  }
}

// Outputs 5