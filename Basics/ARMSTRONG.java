package tkm;
import java.util.Scanner;

public class ARMSTRONG {

	public static void main(String[] args) {
		int d,c=0,temp,arm=0;
		Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        temp=num;
        c=String.valueOf(num).length();
        
        while(num>0) {
        	d=num%10;
        	arm += Math.pow(d, c);
        	num=num/10;
        }
        
        if (arm == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
	}

}
