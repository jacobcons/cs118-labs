import java.awt.Color;

public abstract class MyFigures {
  public static void main(String[] args) {
    Figure[] myFigures = {new Circle(40), new Ellipse(20, 30), new Square(35), new Rectangle(20, 40)};

    for (Figure f: myFigures) {
      System.out.printf("%s\n%f\n\n", f.toString(), f.area());
    }

    System.out.println(Figure.compareAreas(myFigures[0], myFigures[1]));
  }
}
