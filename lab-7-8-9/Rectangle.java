import java.awt.Color;

public class Rectangle extends Figure {
  protected int width;
  protected int height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public double area() {
    return width * height;
  }
  public String toString() {
    return String.format("%s, width = %d, height = %d", super.getClassName(), this.width, this.height);
  }
  public void drawFill(char c) {
    for (int row = 0; row < this.height; row++) {
      super.printRow(c, this.width);
    }
    System.out.println("");
  }
  public void drawBorder(char c){
    super.printRow(c, this.width);
    for (int row = 0; row < this.height - 2; row++) {
      System.out.print(c);
      super.printChars(' ', this.width - 2);
      System.out.println(c);
    }
    super.printRow(c, this.width);
    System.out.println("");
  }
  public static void main(String[] args) {}
}
