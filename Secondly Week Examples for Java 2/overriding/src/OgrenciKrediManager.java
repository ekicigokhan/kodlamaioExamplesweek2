
public class OgrenciKrediManager extends BaseKrediManager {
	public String message() {
		String message = " ��renci i�in kredi faiz oran� ; ";
		return message;
	}

	@Override
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
