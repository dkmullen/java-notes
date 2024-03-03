public class Methods {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  static int add(int x, int y) {
    return x + y;
  }

  // Method Overloading (same method name with different parameters) allows us to
  // call add() with different parameter types
  static double add(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
        System.out.println("Hello, World!");
        myMethod();
        System.out.println(add(17, 44));
        System.out.println(sum(10));
    }
  
    // Recursion is the technique of making a function call itself
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0; // The halt condition or base case
    }
  }


}

/*  
 * public means that the method can be called from other classes
 * static means that the method belongs to the Methods class and not to an object of the Methods class
 * void means that the method has no return value
 * 
 * The main() method is required and you will see it in every Java program
 * Everything inside the main() method will be executed
 */