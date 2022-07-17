
public class Date {

	private Packets packet_date;
	private Employee birthdate;
	private Customer customer_birthdate;
	
	public Date(Packets packet_date, Employee birthdate, Customer customer_birthdate) {
		super();
		this.packet_date = packet_date;
		this.birthdate = birthdate;
		this.customer_birthdate = customer_birthdate;
	}

	public Packets getPacket_date() {
		return packet_date;
	}

	public void setPacket_date(Packets packet_date) {
		this.packet_date = packet_date;
	}

	public Employee getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Employee birthdate) {
		this.birthdate = birthdate;
	}

	public Customer getCustomer_birthdate() {
		return customer_birthdate;
	}

	public void setCustomer_birthdate(Customer customer_birthdate) {
		this.customer_birthdate = customer_birthdate;
	}

}
