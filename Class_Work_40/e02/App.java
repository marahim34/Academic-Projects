public class App {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("Hello");

		boolean b1, b2;

		b1 = str1.equals(str3);
		b2 = str1.equals(str2);

		System.out.println(b1);
		System.out.println(b2);

		// concat
		String conCat = str1.concat(" " + str2);
		System.out.println(conCat);
	}
}