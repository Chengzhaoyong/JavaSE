package shiyan;
import java.util.Scanner;
abstract class Area{
	public abstract double area();
}
class RectArea extends Area{
	 private double length;
	 private double height;
	 public RectArea(double length, double height) {
		this.length= length;
		this.height =height;
	}

	public double area(){
		 return length*height;
	 }
 }
 class RoundArea extends Area{
	 private double r;
	public RoundArea(double r) {
		this.r = r;
	}

	public double area() {
		 return 3.14*r*r;
	 }
 }
 public class ImpleArea {
		public static void main(String[] args) {
			Scanner sc1=new Scanner(System.in);
			double length=sc1.nextDouble();
			Scanner sc2=new Scanner(System.in);
			double height=sc2.nextDouble();
			Scanner sc3=new Scanner(System.in);
			double r=sc3.nextDouble();
			RectArea re=new RectArea(length,height);
			RoundArea ro=new RoundArea(r);
		System.out.println("长方形的面积："+re.area());
		System.out.println("圆的面积；"+ro.area());
			
			
			
			
		}
}
