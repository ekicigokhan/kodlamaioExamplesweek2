
public class OgretmenKrediManager extends BaseKrediManager {
	public String message() {
		String message = " ��retmen i�in kredi faiz oran� ; ";
		return message;
	}

	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
