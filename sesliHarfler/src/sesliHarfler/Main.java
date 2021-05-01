package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'E';

		switch (harf) {
		case 'E', 'İ', 'Ö', 'Ü':
			System.out.println(harf + " ince seslidir.");
			break;
		default:
			System.out.println(harf + " kalın seslidir.");
		}
	}

}
