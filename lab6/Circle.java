import java.awt.Color;

public class Circle extends Ellipse {
  Circle(double radius) {
    super(radius, radius);
  }
  public String toString() {
    return String.format("%s, radius = %f", super.getClassName(), super.semiMajorAxis);
  }
  public static void main(String[] args){}
}
