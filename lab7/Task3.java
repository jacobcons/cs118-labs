import java.awt.Color;
import java.util.*;

public abstract class Task3 {
  public static void main(String[] args) {
    Figure a = new Square(4);
    Figure b = new Rectangle(3, 4);
    a.drawFill('*');
    a.drawBorder('*');
    b.drawFill('*');
    b.drawBorder('*');
  }
}
