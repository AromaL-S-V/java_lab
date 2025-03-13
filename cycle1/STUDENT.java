package tkm;
import java.util.Scanner;

public class STUDENT {

	public static void main(String[] args) {
		int math,phy,chem;
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER THE MARK OF MATHS: ");
		math=obj.nextInt();
		System.out.print("ENTER THE MARK OF PHYSICS: ");
		phy=obj.nextInt();
		System.out.print("ENTER THE MARK OF CHEMISTRY: ");
		chem=obj.nextInt();
		
		System.out.println("TOTAL MARK OF MATHS,PHYSICS AND CHEMISRTY: "+(math+phy+chem));
		System.out.println("TOTAL MARK OF MATHS AND PHYSICS: "+(math+phy));
		
		
		 if((math+phy+chem)>=150) {
	            System.out.println("The student is eligible");
	        }
	        else if((math+phy)>=120) {
	            System.out.println("The student is eligible");
	        } else {
	            System.out.println("The student is not eligible.");
	        }


	}

}
