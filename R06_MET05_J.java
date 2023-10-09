/*     
Rule 06. Methods (MET) 
MET05-J. Ensure that constructors do not call overridable methods
*/

class SuperClass {
  public SuperClass () {
    doLogic();
  }
 
  public void doLogic() {
    System.out.println("This is superclass!");
  }
}
 
class SubClass extends SuperClass {
  private String color = "red";
 
  public void doLogic() {
    System.out.println("This is subclass! The color is :" + color);
    // ...
  }
}
 
public class Overridable {
  public static void main(String[] args) {
    SuperClass bc = new SuperClass();
    // Prints "This is superclass!"
    SuperClass sc = new SubClass();
    // Prints "This is subclass! The color is :null"
  }
}