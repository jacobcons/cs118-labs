import java.awt.Color;
import java.util.*;

public abstract class Task3 {
  public static void main(String[] args) {
    IsoscelesTrapezoid a = new IsoscelesTrapezoid(1, 7);
    IsoscelesTrapezoid b = new IsoscelesTrapezoid(3, 9);
    IsoscelesTrapezoid c = new IsoscelesTrapezoid(5, 11);
    ChristmasTree tree = new ChristmasTree(new IsoscelesTrapezoid[]{a, b, c});
    tree.print();
  }
}

class ChristmasTree {
  protected IsoscelesTrapezoid[] trapezoids;
  protected int maxB = 0;

  ChristmasTree(IsoscelesTrapezoid[] trapezoids) {
    for (IsoscelesTrapezoid trapezoid: trapezoids) {
      int currentB = trapezoid.getB();
      if (currentB > this.maxB) this.maxB = currentB;
    }

    this.trapezoids = trapezoids;
  }

  public void print() {
    for (IsoscelesTrapezoid trapezoid: trapezoids) {
      int offset = (this.maxB - trapezoid.getB()) / 2;
      trapezoid.drawFillOffset('*', offset);
    }
    printStem(2);
    printBase(7);
  }

  public void printStem(int l) {
    int spacesToPrint = (this.maxB - 1) / 2;
    for (int i = 0; i < l; i++) {
      Figure.printChars(' ', spacesToPrint);
      System.out.println("*");
    }
  }

  public void printBase(int l) {
    int spacesToPrint = (this.maxB - l) / 2;
    Figure.printChars(' ', spacesToPrint);
    Figure.printRow('*', l);
  }
}
