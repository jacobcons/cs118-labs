import java.awt.Color;
import java.util.*;

public abstract class Task2 {
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
        printShapeDetails(shape);
        break;
      case "e":
        semiMajorAxis = Float.parseFloat(args[1]);
        semiMinorAxis = Float.parseFloat(args[2]);
        shape = new Ellipse(semiMajorAxis, semiMinorAxis);
        printShapeDetails(shape);
        break;
      case "s":
        length = Float.parseFloat(args[1]);
        shape = new Square(length);
        printShapeDetails(shape);
        break;
      case "r":
        width = Float.parseFloat(args[1]);
        height = Float.parseFloat(args[2]);
        shape = new Rectangle(width, height);
        printShapeDetails(shape);
        break;
      case "i":
        dialogue();
    }
  }

  public static void dialogue() {
    Scanner sc = new Scanner(System.in);
    Figure shape = new Square(0);
    while (true) {
      System.out.print("Enter type: ");
      String type = sc.next();
      switch(type) {
        case "c":
          System.out.print("Enter radius: ");
          double radius = sc.nextFloat();
          shape = new Circle(radius);
          break;
        case "e":
          System.out.print("Enter semi-major axis: ");
          double semiMajorAxis = sc.nextFloat();
          System.out.print("Enter semi-minor axis: ");
          double semiMinorAxis = sc.nextFloat();
          shape = new Ellipse(semiMajorAxis, semiMinorAxis);
          break;
        case "s":
          System.out.print("Enter length: ");
          double length = sc.nextFloat();
          shape = new Square(length);
          break;
        case "r":
          System.out.print("Enter width: ");
          double width = sc.nextFloat();
          System.out.print("Enter height: ");
          double height = sc.nextFloat();
          shape = new Rectangle(width, height);
          break;
        case "x":
          return;
      }
      printShapeDetails(shape);
    }
  }

  public static void printShapeDetails(Figure shape) {
    System.out.println(shape.toString());
    System.out.println(shape.area());
  }
}
