import javax.print.attribute.IntegerSyntax;

public class Main {

	public static void main(String[] args) {
		String message = giveCountry();
		System.out.println(message);
		int total = topla(5, 4); // Buradaki 5ve4 parametre veya arg?man'd?r.
		System.out.println(total);
		int birdenCokToplam = topla(10, 20, 30, 40, 500);
		System.out.println(birdenCokToplam);
		delete();
	}

	public static void add(String islem) { // VO?D DE?ER D?ND?RMEZ.
		System.out.println("Eklendi !");
	}

	public static void delete() {
		System.out.println("Silindi !");
	}

	public static void update() {
		System.out.println("G?ncellendi !");
	}

	public static int topla(int number1, int number2) {
		return number1 + number2;
	}

	private static int topla(int... numbers) {// ... >Variable Argumants< burdaki say?lar int array gibi ?al???r.
		int total = 0;
		for (int number : numbers) {
			total = total + number;
		}
		return total;
	}

	public static String giveCountry() {
		return "Ankara + bursa";
	}

}
