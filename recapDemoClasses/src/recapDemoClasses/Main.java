package recapDemoClasses;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.bolme(2, 0);
		System.out.println("islem sonucu : " + sonuc);
		sonuc = dortIslem.bolme(4, 2);
		System.out.println(sonuc);
		sonuc = dortIslem.topla(2,3);
		System.out.println(sonuc);
	}

}
