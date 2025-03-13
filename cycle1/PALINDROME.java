package tkm;
import java.util.Scanner;

public class PALINDROME {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		int n,d,o,r=0;
		System.out.print("ENTER THE NUMBER: ");
		n=obj.nextInt();
		o=n;
		
		while(n>0) {
			d=n%10;
			r=(r*10)+d;
			n=n/10;
		}
		if(r==o) {
			System.out.println(o+" is a Palindrome");
		}
		else {
			System.out.println(o+" is not a Palindrome");
		}

	}

}
