package inheritance;

public class CustomerManager {
	public void add(Customer customer)
	{
		System.out.println(customer.customerNumber);
	}
	
	public void addMultiple(Customer[] customers)
	{
		for(Customer customer : customers)
		{
			add(customer);
		}
	}
}
