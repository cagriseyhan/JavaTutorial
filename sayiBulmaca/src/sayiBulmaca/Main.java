package sayiBulmaca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = new int[] {1,3,4,6,7,9,0};
		int aranacak = 5;
		
		for(int sayi : sayilar)
		{
			if(sayi == aranacak)
			{
				System.out.println(aranacak + " aranan sayi dizi icerisinde vardir.");
				return;
			}
		}
		System.out.println("aranan sayi dizi icerisinde yoktur.");
	}

}
