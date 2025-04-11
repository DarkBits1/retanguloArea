package application;
import java.util.Scanner;
import java.util.Locale;
import entities.rectangle;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		rectangle data = new rectangle();
		System.out.println("Enter the rectangle width and height:");
		data.width = sc.nextDouble();
		data.height = sc.nextDouble();
		
		System.out.println(data.result());
		
		
		
		
		
		sc.close();
	}

}
