

public class Customer {
	
	private String name;
	private String birthdate;
	private String gender;
	private String email;
	private String address;
	private String town;
	private String city;
	private String phone;
	private int customer_�d;
	
	public Customer(String name, String birthdate, String gender,String email,String address, String town, String city,
			String phone,int  customer_�d ) {
		super();
		
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.email=email;
		this.address = address;
		this.town = town;
		this.city = city;
		this.phone = phone;
		this.customer_�d=customer_�d;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email=email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCustomer_�d()
	{
		return customer_�d;
	}
	public void setCustomer_�d(int customer_�d)
	{
		this.customer_�d=customer_�d;
	}
	public String ListCustomer()
	{
		return " Customer Name: "+getName()+"\n"+" BirhDate: "+getBirthdate()+"\n"+" Gender: "+getGender()+"\n"+
	      " Email Address: "+getEmail()+"\n"+" Address: "+getAddress()+"\n"+" Town: "+getTown()+"\n"+" City: "+getCity()+"\n"+" Phone Number: "+
		     getPhone()+"\n"+" Customer Id: "+getCustomer_�d()+"\n";
	}
}