package temp_convert;

import java.util.Scanner;

public class Program {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a celcius temperature: ");
		float celcius = sc.nextFloat();
		
		System.out.print("Enter a fahrenheit temperature: ");
		float fahrenheit = sc.nextFloat();
		
		System.out.println("Celcius to fahrenheit: " + celciusToFahrenheit(celcius));
		System.out.println("Fahrenheit to celsius: " + fahrenheitToCelcius(fahrenheit));
		
		sc.close();
	}
	
	static float celciusToFahrenheit(float celsiusTemp) {
		float F = 0.0f;
		F = (1.8f * celsiusTemp) + 32;
		return F;
	}
	
	static float fahrenheitToCelcius(float fahrenheitTemp) {
		float C = 0.0f;
		C = (fahrenheitTemp - 32) * 5 / 9;
		return C;
	}
}