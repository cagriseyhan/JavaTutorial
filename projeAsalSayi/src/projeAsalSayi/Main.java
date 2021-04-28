package projeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 78;
		int remainder = 0;		
		boolean isPrime = false;
		for(int i = 2;i<(number/2 + 1);i++)
		{
			remainder = number % i;
			if(number < 2)
			{
				System.out.println("");
			}
			if(remainder == 0)
			{
				isPrime = false;
				break;
			}
			isPrime = true;
		}
		System.out.println(isPrime);
	}

}
