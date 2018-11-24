import java.awt.Color;

public class RightAngleTrapezoid extends Trapezoid {
  RightAngleTrapezoid(int a, int b) {
    super(a, b, b - a + 1);
  }
  public void drawFill(char c) {
    int start = this.a == 0 ? 1 : this.a;
    for (int charsToPrint = start; charsToPrint <= this.b; charsToPrint++) {
      super.printRow(c, charsToPrint);
    }
    System.out.println("");
  }
  public void drawBorder(char c) {
    
  }
  public static void main(String[] args) {}
}
