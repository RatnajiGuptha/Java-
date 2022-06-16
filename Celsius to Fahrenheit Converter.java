import java.util.*;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Temparature in Celsius:");
		float a = sc.nextInt();
		float res = (a * 9/5) + 32;
		System.out.println("Temparature in Fahrenheit is "+res+"F");
	}

}
