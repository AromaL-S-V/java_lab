package tkm;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0,n,i;
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTE THE LIMIT: ");
		n=obj.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=3;i<=n;i++) {
			c=a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
		}
		

	}

}
