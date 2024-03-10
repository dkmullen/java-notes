package classes;
public class Main {
  // Class 'attributes' or 'fields'
  int x = 5;
  String favColor = "blue";
  final double pi = 3.14159d;

  static int addTwoNumbers(int a, int b) {
    return a + b;
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating an object of the class");
  }
}


/* 
/ In the example above, we created a static method, which means that it can be accessed 
without creating an object of the class, unlike public, which can only be accessed by objects
 *
 */