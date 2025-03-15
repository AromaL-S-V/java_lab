package tkm;
import java.util.Scanner;

public class Rect {
	double length;
	double width;
	
	Rect(){
		this.length=1.0;
		this.width=1.0;
	}
	Rect(double length,double width){
		this.length=length;
		this.width=width;
	}
	
	public double area() {
		return length*width;
	}
	public double peri() {
		return 2*(length+width);
	}
	
	public void display() {
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+peri());
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rect r1=new Rect();
		r1.display();
		
		System.out.print("Enter the Length: ");
		double l=sc.nextDouble();
		System.out.print("Enter the Width: ");
		double w=sc.nextDouble();
		
		Rect r2=new Rect(l,w);
		r2.display();
	}

}
