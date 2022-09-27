
public class BaseKrediManager {

	public String message() {
		String message = " için kredi faiz oranı ; ";
		return message;
	}

	public double hesapla(double tutar) {
		System.out.println();
		return tutar * 1.18;
	}
}
