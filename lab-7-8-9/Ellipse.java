import java.awt.Color;

public class Ellipse extends Figure {
  protected double semiMajorAxis;
  protected double semiMinorAxis;

  Ellipse(double semiMajorAxis, double semiMinorAxis) {
    this.semiMajorAxis = semiMajorAxis;
    this.semiMinorAxis = semiMinorAxis;
  }
  public double area() {
    return Math.PI * this.semiMajorAxis * this.semiMinorAxis;
  }
  public String toString() {
    return String.format("%s, semi-major axis = %f, semi-minor axis = %f", super.getClassName(), this.semiMajorAxis, this.semiMinorAxis);
  }
  public void drawFill(char c){};
  public void drawBorder(char c){};
  public static void main(String[] args){}
}
