import java.awt.Color;

public class MutableSquare extends Square {
  MutableSquare(double length) {
    super(length);
  }
  public void setLength(double length) {super.width = length; super.height = length;}
  public static void main(String[] args){}
}
