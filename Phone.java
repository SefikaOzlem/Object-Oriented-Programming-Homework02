
public class Phone {
	private Customer phone;
	private Office phone_number;
    private Employee number_phone;
	
    
    public Phone(Customer phone, Office phone_number, Employee number_phone) {
		super();
		this.phone = phone;
		this.phone_number = phone_number;
		this.number_phone = number_phone;
	}


	public Customer getPhone() {
		return phone;
	}


	public void setPhone(Customer phone) {
		this.phone = phone;
	}


	public Office getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(Office phone_number) {
		this.phone_number = phone_number;
	}


	public Employee getNumber_phone() {
		return number_phone;
	}


	public void setNumber_phone(Employee number_phone) {
		this.number_phone = number_phone;
	}
}
