import java.util.*;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = (a > b ) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(res + " is the greatest number");
	}

}
