package tkm;
import java.util.Scanner;

public class RECTANGLE {

	public static void main(String[] args) {
		int length,width;
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER THE LENGTH: ");
		length=obj.nextInt();
		System.out.print("ENTER THE WIDTH: ");
		width=obj.nextInt();
		
		System.out.println("Area of Rectangle: "+length*width);
		System.out.println("Perimeter of Rectangle: "+2*(length+width));
	}

}
