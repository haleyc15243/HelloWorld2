import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	//Print "Hello World!"
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println("Date: " + formatter.format(date));
		System.out.println("Here ye: important announcement...");
		System.out.println("Hello World!");
		System.out.println("Hi Alice");
		System.out.println("Hi Bob.");
		System.out.println("Hi Charlie");
		System.out.println("Hi Denise");
		System.out.println("Goodbye!");
		System.out.println("Free memory (bytes): " + 
				Runtime.getRuntime().freeMemory());
	}
}
