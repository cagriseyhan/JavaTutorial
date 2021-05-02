package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		int sayi = topla(6,8);
		System.out.println(yeniMesaj + " - " + sayi);
		int toplam = topla2(1,5,8,9,1,4);
		System.out.println(toplam);
	}
	
	public static void ekle()
	{
		System.out.println("eklendi");
	}
	
	public static void sil()
	{
		System.out.println("silindi");
	}
	
	public static void guncelle()
	{
		System.out.println("guncellendi");
	}
	
	public static int topla(int sayi1, int sayi2)
	{
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar)
	{
		int toplam = 0;
		for(int sayi : sayilar)
		{
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer()
	{
		return "Edirne";
	}
}
