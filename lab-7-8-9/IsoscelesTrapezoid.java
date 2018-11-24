import java.awt.Color;

public class IsoscelesTrapezoid extends Trapezoid {
  IsoscelesTrapezoid(int a, int b) {
    super(a, b, (b - a + 2) / 2);
  }
  public void drawFillOffset(char c, int offset) {
    int start = this.a == 0 ? 1 : this.a;
    for (int charsToPrint = start; charsToPrint <= this.b; charsToPrint+=2) {
      int spacesToPrint = ((this.b - charsToPrint) / 2) + offset;
      Figure.printChars(' ', spacesToPrint);
      Figure.printRow(c, charsToPrint);
    }
  }
  public void drawFill(char c) {
    int start = this.a == 0 ? 1 : this.a;
    for (int charsToPrint = start; charsToPrint <= this.b; charsToPrint+=2) {
      int spacesToPrint = (this.b - charsToPrint) / 2;
      Figure.printChars(' ', spacesToPrint);
      Figure.printRow(c, charsToPrint);
    }
  }
  public void drawBorder(char c) {
    
  }
  public static void main(String[] args) {}
}
