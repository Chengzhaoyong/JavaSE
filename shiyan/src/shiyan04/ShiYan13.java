package shiyan04;
  class Circle{
	  double r;
	  public double area(double r){
		  return 3.14*r*r;
	  }
	  }
public class ShiYan13 {
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println(c.area(2.0));
	}
}