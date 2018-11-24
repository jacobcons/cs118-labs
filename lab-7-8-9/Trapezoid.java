import java.awt.Color;

public abstract class Trapezoid extends Figure {
  protected int a;
  protected int b;
  protected int h;

  Trapezoid(int a, int b, int h) {
    this.a = a;
    this.b = b;
    this.h = h;
  }
  public double area() {
    return 0.5 * (this.a + this.b) * this.h;
  }
  public String toString() {
    return String.format("%s, a = %d, b = %d, h = %d", super.getClassName(), this.a, this.b, this.h);
  }
  public int getB() {
    return this.b;
  }
  public static void main(String[] args) {}
}
