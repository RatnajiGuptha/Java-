import java.util.*;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name  = sc.nextLine();
		System.out.println("Enter the Creator Name :");
		String CName = sc.nextLine();
		System.out.println("Enter the Purpose :");
		String Purpose = sc.nextLine(); 
		System.out.println("Memory Space :");
		int Space = sc.nextInt();
		System.out.println("Speed :");
		double speed = sc.nextDouble();

		System.out.println("My Details :");
		System.out.println("I am the Robot named "+name+".");
		System.out.println("I was created by "+CName+".");
		System.out.println("I am created for the purpose of "+Purpose+".");
		System.out.println("My memory space is around "+Space+"Gb and my speed is "+speed+"Tb.");
	}

}
