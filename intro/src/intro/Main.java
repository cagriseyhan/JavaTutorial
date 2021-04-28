package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeKodu = "İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		System.out.println(internetSubeKodu);
		
		if(dolarDun<dolarBugun)
		{
			System.out.println("Dolar düştü resmi");
		}
		else if( dolarDun>dolarBugun)
		{
			System.out.println("Dolar yükseldi resmi");
		}
		else
		{
			System.out.println("Dolar eşittir resmi");
		}
		
		String[] krediler = 
			{
				"Hızlı Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi kredisi",
				"Msb kredisi",
				"Kültür Bakanlığı kredisi"
			};
		for(String kredi : krediler)
		{
			System.out.println(kredi);
		}
	}

}
