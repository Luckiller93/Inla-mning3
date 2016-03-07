public class KaffeKopp {
	String manufacturer;
	int volume;
	
	public KaffeKopp () {
		manufacturer = "Unknown";
		volume = 0;
	}
	
	public KaffeKopp(String man, int vol) {
		manufacturer = man;
		volume = vol;
	}
	
	public String toString() {
		return ("Tillverkare = " + manufacturer + " Volym = " + volume);
	}
}