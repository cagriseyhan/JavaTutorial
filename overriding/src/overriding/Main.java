package overriding;

public class Main {
	public static void main(String[] args)
	{
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),
											new TarimKrediManager(), new OgrenciKrediManager()};
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(500));
		
		for(BaseKrediManager krediManager : baseKrediManagers)
		{
			System.out.println(krediManager.hesapla(1000));
		}
		
	}
}
