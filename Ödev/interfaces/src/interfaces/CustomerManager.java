package interfaces;

public class CustomerManager {

	ICustomerDal customerDal;

	private CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;

	}

	public void add() {
		// iş kodları
		customerDal.Add();

	}

}
