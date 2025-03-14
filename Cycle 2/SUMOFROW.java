package thispackage;
import java.util.Scanner;

public class SUMOFROW {

	public static void main(String[] args) {
		int[] res = new int[3];
		int biggestvalue = res[0];
		int highestrowvalue = 0;
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter value: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(" ---MATRIX---");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		for(int i=0;i<3;i++) {
       		res[i] = 0;
			for(int j=0;j<3;j++) {
				res[i] = res[i] + arr[i][j];
			}
			System.out.println(" ");
		}
		for(int i=0;i<3;i++) {
			if (biggestvalue< res[i]) {
				biggestvalue = res[i];
				highestrowvalue = i;
			}
		}
		System.out.println("Highest row sum: "+biggestvalue);
		System.out.println("Row with highest sum: "+ (highestrowvalue+1));
	}

}
