

public class Customer {
	
	private String name;
	private String birthdate;
	private String gender;
	private String email;
	private String address;
	private String town;
	private String city;
	private String phone;
	private int customer_ýd;
	
	public Customer(String name, String birthdate, String gender,String email,String address, String town, String city,
			String phone,int  customer_ýd ) {
		super();
		
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.email=email;
		this.address = address;
		this.town = town;
		this.city = city;
		this.phone = phone;
		this.customer_ýd=customer_ýd;
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
	public int getCustomer_ýd()
	{
		return customer_ýd;
	}
	public void setCustomer_ýd(int customer_ýd)
	{
		this.customer_ýd=customer_ýd;
	}
	public String ListCustomer()
	{
		return " Customer Name: "+getName()+"\n"+" BirhDate: "+getBirthdate()+"\n"+" Gender: "+getGender()+"\n"+
	      " Email Address: "+getEmail()+"\n"+" Address: "+getAddress()+"\n"+" Town: "+getTown()+"\n"+" City: "+getCity()+"\n"+" Phone Number: "+
		     getPhone()+"\n"+" Customer Id: "+getCustomer_ýd()+"\n";
	}
}