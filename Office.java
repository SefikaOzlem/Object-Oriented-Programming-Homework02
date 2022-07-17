
public class Office {
	
	
	private String name;
	private String address;
	private String town;
	private String City;
	private String number;
	private int id;
	private int total;
	
	public Office(int id,String name, String address, String town, String city, String number) {
		super();
		
		this.name = name;
		this.address = address;
		this.town = town;
		this.City = city;
		this.number = number;
		this.id=id;
		this.total=getTotal();
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String ListOffice()
	{
		return " Offýce Id: "+getId()+"\n"+" Office Name: "+getName()+"\n"+" Office Address: "+getAddress()+"\n"+" Town: "+getTown()+"\n"+
	               " City: "+getCity()+"\n"+" Phone Number: "+getNumber()+"\n";
	}

}
