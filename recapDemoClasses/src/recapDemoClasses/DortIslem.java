package recapDemoClasses;

public class DortIslem {
	public int topla(int sayi1,int sayi2)
	{
		return sayi1 + sayi2;
	}
	
	public int cikar(int sayi1,int sayi2)
	{
		return sayi1 - sayi2;
	}
	
	public int carp(int sayi1,int sayi2)
	{
		return sayi1 * sayi2;
	}
	
	public int bolme(int sayi1,int sayi2)
	{
		try { // 0 ile bolme islemi icin yazildi
			return sayi1 / sayi2;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
}
