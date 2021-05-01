package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 496;
		int total = 0;
		
		for(int i=1;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				total += i;
			}
		}
		if(total == number)
		{
			System.out.println(number + " mukemmel bir sayidir.");
		}
		else
		{
			System.out.println(number + " mukemmel bir sayi degildir.");
		}
	}

}
