package constructor;
public class CheckClass {
  private CheckClass() {
  System.out.println("Private Default Constructor called");
  }
  public static CheckClass getObject() {
  CheckClass check = new CheckClass();
  return check;
  }
  }
