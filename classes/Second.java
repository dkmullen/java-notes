package classes;

public class Second {

  public static void main(String[] args) {
    // Create an object of the Main class in another file
    Main myObj = new Main();
    Main myObjAlso = new Main();
    System.out.println(myObj.x);
    System.out.println(myObj.favColor);
    myObjAlso.x = 25; // Has its own copy of x
    System.out.println(myObj.x);
    System.out.println(myObjAlso.x);
    System.out.println(myObj.pi); // Set as final (constant) in Main.java
    // Static methods can be called without creating objects
    System.out.println(Main.addTwoNumbers(5, 3));
    // Public methods must be called by creating an object of the class
    myObj.myPublicMethod();
  }
}