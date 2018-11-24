import java.awt.Color;

public class MutableCircle extends Circle {
  MutableCircle(double radius) {
    super(radius);
  }
  public void setRadius(double radius) {super.semiMajorAxis = radius; super.semiMinorAxis = radius;}
  public static void main(String[] args){}
}
