
public class TarimKrediManager extends BaseKrediManager {
	public String message() {
		String message = " Tarım için kredi faiz oranı ; ";
		return message;
	}

	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
