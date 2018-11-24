import java.awt.Color;

public abstract class Task1 {
  public static void main(String[] args) {
    String type = args[0];
    Figure shape = new Square(0);
    double radius;
    double semiMajorAxis;
    double semiMinorAxis;
    double length;
    double width;
    double height;
    switch(type) {
      case "c":
        radius = Float.parseFloat(args[1]);
        shape = new Circle(radius);
        break;
      case "e":
        semiMajorAxis = Float.parseFloat(args[1]);
        semiMinorAxis = Float.parseFloat(args[2]);
        shape = new Ellipse(semiMajorAxis, semiMinorAxis);
        break;
      case "s":
        length = Float.parseFloat(args[1]);
        shape = new Square(length);
        break;
      case "r":
        width = Float.parseFloat(args[1]);
        height = Float.parseFloat(args[2]);
        shape = new Rectangle(width, height);
        break;
    }
    System.out.println(shape.toString());
    System.out.println(shape.area());
  }
}
