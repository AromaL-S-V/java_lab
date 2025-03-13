package tkm;
import java.util.Scanner;


public class StringReplace {

	public static void main(String[] args) {
		System.out.print("Enter String Value: ");
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        
        System.out.print("Enter the word to be replaced: ");
        String replaceString = sc.nextLine();
        
        System.out.print("Enter the new word:");
        String newString = sc.nextLine();
        
        System.out.println("--Replaced String--");
        System.out.println(myStr.replace(replaceString, newString));

	}

}
