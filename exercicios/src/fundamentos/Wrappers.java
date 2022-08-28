package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		// Byte
		Byte b = 100;
		Short s = 1000;
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		
		Integer i = Integer.parseInt("10000");
		System.out.println(i * 3);
		
		Float f = 123.08F;
		System.out.println(f.floatValue());
		
		Double d = 123456.60;
		System.out.println(d.floatValue());
		
		Long l = 100000L;
		System.out.println((l / 3.0));
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
	}
}
