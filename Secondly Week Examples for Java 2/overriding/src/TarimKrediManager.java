
public class TarimKrediManager extends BaseKrediManager {
	public String message() {
		String message = " Tar�m i�in kredi faiz oran� ; ";
		return message;
	}

	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
