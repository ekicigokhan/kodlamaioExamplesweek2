public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 12, 23, 366, 42, 35, 6 };
		int wantednumber = 366;
		boolean isThere = false;

		for (int travelnumbers : numbers) {
			if (travelnumbers == wantednumber) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			giveMessage("Say� mevcuttur : " + wantednumber);
		} else {
			giveMessage("Say� mevcut de�ildir. + " + wantednumber);
		}

	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
