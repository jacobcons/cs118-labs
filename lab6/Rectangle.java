import java.awt.Color;

public class Rectangle extends Figure {
  protected double width;
  protected double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double area() {
    return width * height;
  }
  public String toString() {
    return String.format("%s, width = %f, height = %f", super.getClassName(), this.width, this.height);
  }
  public static void main(String[] args){}
}
