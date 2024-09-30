public class App {
	public static void main(String[] args) {
		char singleChar = 'A';
		System.out.println(singleChar);

		String text = "This is the string text. It is recommended to use String Text when it is required to write a long";

		System.out.println(text);

		// You can use declare string two ways

		/*
		 * 1. String literals: which is enclosed in double quotes as written above
		 * 2. New String format: Use the keyword new before declaring the string
		 */

		String greetings = new String("Hello Pokhrel!");
		System.out.println(greetings);

		System.out.println("3rd char in greeting: " + greetings.charAt(3));
		System.out.println("length: " + greetings.length());
		System.out.println("Substring: " + greetings.substring(1, 4));
	}
}