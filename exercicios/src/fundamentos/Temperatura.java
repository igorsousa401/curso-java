package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(Fº - 32) * (5/9) = Cº
		
		
		final double correction = 32;
		final double factor_correction = 5/9.0;
		
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - correction) * factor_correction;
		
		System.out.println(fahrenheit + " fahrenheit em Celsius vale " + celsius);
	}
}
