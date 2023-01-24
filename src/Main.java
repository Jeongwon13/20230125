import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		
		int[] ab = new int[6];
		
		for(int i=0; i<ab.length; i++) {
			ab[i] = sc.nextInt();
		System.out.print(ab[i]);
		}
		
		int[] a = {1,1,2,2,2,8};
		
		for(int i=0; i<a.length; i++) {
			System.out.print(ab[i]-a[i]);
			System.out.println(" ");
		}
	
	}

}
