
public class Address {
 
	 private Office office_address;
	 private Customer customer_office;
	 private Employee employee_address;
	
	 
	 public Address(Office office_address, Customer customer_office, Employee employee_address) {
		super();
		this.office_address = office_address;
		this.customer_office = customer_office;
		this.employee_address = employee_address;
	}


	public Office getOffice_address() {
		return office_address;
	}


	public void setOffice_address(Office office_address) {
		this.office_address = office_address;
	}


	public Customer getCustomer_office() {
		return customer_office;
	}


	public void setCustomer_office(Customer customer_office) {
		this.customer_office = customer_office;
	}


	public Employee getEmployee_address() {
		return employee_address;
	}


	public void setEmployee_address(Employee employee_address) {
		this.employee_address = employee_address;
	}
}
