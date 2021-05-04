package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer customer = new IndividualCustomer();
		customer.customerNumber = "1234";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "4679";
		
		CustomerManager customerManager = new  CustomerManager();
		
		SyndicateCustomer syndicateCustomer = new SyndicateCustomer();
		syndicateCustomer.customerNumber = "59023";
		
		Customer[] customers = {customer,corporateCustomer, syndicateCustomer};
		customerManager.addMultiple(customers);
		
	}

}
