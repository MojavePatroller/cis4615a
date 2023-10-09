/*     
Rule 06. Methods (MET) 
MET05-J. Ensure that constructors do not call overridable methods
*/

class SuperClass {
  public SuperClass() {
    doLogic();
  }
 
  public final void doLogic() {
    System.out.println("This is superclass!");
  }
}