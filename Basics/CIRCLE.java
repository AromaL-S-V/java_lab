package tkm;
import java.util.Scanner;

public class CIRCLE {

	public static void main(String[] args) {
		int radius;
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER THE RADIUS: ");
		radius=obj.nextInt();
		
		System.out.println("Area of Circle: "+3.14*radius*radius);
		System.out.println("Perimeter of Circle: "+2*3.14*radius);
	}

}
