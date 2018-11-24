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
  public void drawFill(char c) {
    for (int row = 0; row < height; row++) {
      printRow(c);
    }
    System.out.println("");
  }
  public void drawBorder(char c){
    printRow(c);
    for (int row = 0; row < height - 2; row++) {
      System.out.print("*");
      for (int col = 0; col < width - 2; col++) {
        System.out.print(" ");
      }
      System.out.print("*\n");
    }
    printRow(c);
    System.out.println("");
  }
  public void printRow(char c) {
    for (int col = 0; col < width; col++) System.out.print(c);
    System.out.println("");
  }
  public static void main(String[] args) {}
}
