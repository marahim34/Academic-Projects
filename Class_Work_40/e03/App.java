public class App {
	public static void main(String[] args) {
		// Generating ASCII
		for (int i = 0; i <= 127; i++) {
			System.out.println("ASCII code of " + i + " is : " + (char) i);
		}

		String banglaString = "বাংলা"; // Bengali word for "Bengali"

		for (int i = 0; i < banglaString.length(); i++) {
			char ch = banglaString.charAt(i);
			int unicode = ch; // Get the Unicode code point of the character
			System.out.println("Character: " + ch + " | Unicode: " + Integer.toHexString(unicode).toUpperCase());
		}

	}
}