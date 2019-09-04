import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println("원의 반지름>>" + r * 2 * 3.14);
		System.out.println("원의 면적>>" + r* r * 3.14);
		
	}

}
