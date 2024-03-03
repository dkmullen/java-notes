public class Main {
  public static void main(String[] args) {
    System.out.println("Hey now, World!");
    System.out.println(8*3);

    // String name = "Dennis";
    // Set a constant variable with the final keyword (final String name = "Dennis";)

    // Java primitive data types: byte, short, int, long, float, double, char, boolean

    // char letter = 'D';
    // char can also take a unicode value, like char letter = '\u0044', or an ASCII value, like char letter = 68;
    // int and double are preferred for numbers, though the others can be useful for memory management

    float num = 3.14f, age= 59.75f;
    double pi = 3.14159d;
    char unicode = 68;
    System.out.println(num + age + pi);
    System.out.println(unicode);

    

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    int myOtherInt = (int) myDouble; // Manual casting: double to int
    System.out.println(++myOtherInt);

    // Loop through an array with for-each (similar to JS for...of loop - other loops are identical)
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // How to create an array of strings
    for (String i : cars) {
      System.out.println(i);
    }
    System.out.println("Fav: " + cars[2]);

    // Multi-dimensional arrays are also possible
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = myNumbers[1][2];
    System.out.println(x);

    int r = 0;
    int a = ++r;
    int b = r++;
    System.out.println(a + " " + b + " " + r);

    // The difference between ++r and r++ is that the first increments the value before the current operation, 
    // and the second increments the value after the current operation.

  }
}

// The main difference between primitive and non-primitive data types are:

// Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
// Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
// A primitive type has always a value, while non-primitive types can be null.
// A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

// Non Primitive Data Types (Reference Types) include: Strings, Arrays, Classes, Interfaces, etc.

/* Java operators are very similar to JS operators, but one difference is that increment (++) goes
before the number (++x, not x++ ??? or maybe not - see above. JS has pre and post increment too).
Also, == not ===

A ternary operator is the same as in JS, but with parentheses around the condition (x > y) ? x : y;
The switch statement is the same
*/

