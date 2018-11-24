import java.awt.Color;

public class Square extends Rectangle {
  Square(double length) {
    super(length, length);
  }
  public String toString() {
    return String.format("%s, side length = %f", super.getClassName(), super.width);
  }
  public static void main(String[] args){}
}
