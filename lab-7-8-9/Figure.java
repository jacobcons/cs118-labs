import java.awt.Color;

public abstract class Figure {
  protected Color color = Color.blue;
  public void setColor(Color c) {color = c;}
  public Color getColor() {return color;}
  public String getClassName() {return this.getClass().getSimpleName();}
  public static int compareAreas(Figure a, Figure b) {
    double aArea = a.area();
    double bArea = b.area();

    if (aArea > bArea) return 1;
    else if (bArea > aArea) return -1;
    return 0;
  }
  public static void printChars(char c, int len) {
    for (int col = 0; col < len; col++) System.out.print(c);
  }
  public static void printRow(char c, int len) {
    printChars(c, len);
    System.out.println("");
  }
  public abstract double area();
  public abstract String toString();
  public abstract void drawFill(char c);
  public abstract void drawBorder(char c);

  public static void main(String[] args) {
    Rectangle a = new Rectangle(4, 5);
    System.out.println(a.toString());
    System.out.println(a.area());


    Square b = new Square(4);
    System.out.println(b.toString());
    System.out.println(b.area());


    MutableSquare c = new MutableSquare(3);
    System.out.println(c.toString());
    System.out.println(c.area());
    c.setLength(5);
    System.out.println(c.area());

    Ellipse d = new Ellipse(3, 2);
    System.out.println(d.toString());
    System.out.println(d.area());

    Circle e = new Circle(1);
    System.out.println(e.toString());
    System.out.println(e.area());

    MutableCircle f = new MutableCircle(1);
    System.out.println(f.toString());
    System.out.println(f.area());
    f.setRadius(2);
    System.out.println(f.area());
  }
}
