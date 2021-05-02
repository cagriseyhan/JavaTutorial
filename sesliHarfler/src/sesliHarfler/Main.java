package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'E';

		switch (harf) {
		case 'E', 'Ü', 'İ', 'Ö':
			System.out.println(harf + " ince seslidir.");
			break;
		default:
			System.out.println(harf + " kalÄ±n seslidir.");
		}
	}

}
