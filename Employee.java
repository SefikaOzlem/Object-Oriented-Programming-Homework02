
public class Employee {
 
	private int employee_id;
	private String off�ce_�d;
	private String type;
	private String name;
	private String birthdate;
	private String Gender;
	private String Address;
	private String town;
	private String city;
	private String phone;
	
	
	public Employee(int employee_id, String off�ce_�d, String type, String name, String birthdate, String gender,
			String address, String town, String city, String phone) {
		super();
		
		this.employee_id = employee_id;
		this.off�ce_�d = off�ce_�d;
		this.type = type;
		this.name = name;
		this.birthdate = birthdate;
		this.Gender = gender;
		this.Address = address;
		this.town = town;
		this.city = city;
		this.phone = phone;
	}
	double salary;

	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getOff�ce_�d() {
		return off�ce_�d;
	}


	public void setOff�ce_�d(String off�ce_�d) {
		this.off�ce_�d = off�ce_�d;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
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
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String ListEmployee()
	{
		return " Employee Id: "+getEmployee_id()+"\n"+" Office Id: "+getOff�ce_�d()+"\n"+" Type: "+getType()+"\n"+
	      " Name: "+getName()+"\n"+" BirthDate: "+getBirthdate()+"\n"+" Gender: "+getGender()+"\n"+" Address: "+getAddress()
		  +"\n"+" Town: "+getTown()+"\n"+" City: "+getCity()+"\n"+" Phone Number: "+getPhone()+"\n";
	}
	
}
