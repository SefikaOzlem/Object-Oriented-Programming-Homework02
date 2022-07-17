
public class Packets {
	
	private String senderCustomer;
	private String receiverCustomer;
	private String weight;
	private String volType;
	private String date;
	private int packet_�d;
	private int status;
	
	

	public Packets(String senderCustomer, String receiverCustomer, String weight, String volType, String date,int packet_�d ) 
	{
		super();
		
		this.senderCustomer = senderCustomer;
		this.receiverCustomer = receiverCustomer;
		this.weight = weight;
		this.volType = volType;
		this.date = date;
		this.packet_�d=packet_�d;
		this.status=getStatus();
	}
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public String getSenderCustomer() {
		return senderCustomer;
	}


	public void setSenderCustomer(String senderCustomer) {
		this.senderCustomer = senderCustomer;
	}


	public String getReceiverCustomer() {
		return receiverCustomer;
	}


	public void setReceiverCustomer(String receiverCustomer) {
		this.receiverCustomer = receiverCustomer;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getVolType() {
		return volType;
	}


	public void setVolType(String volType) {
		this.volType = volType;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	public int getPacket_�d()
	{
		return packet_�d;
	}
	public void setPacket_�d(int packet_�d)
	{
		this.packet_�d=packet_�d;
	}
	
	public String ListPackets()
	{
		return " Sender Customer Id: "+getSenderCustomer()+"\n"+" Receiver Customer Id: "+getReceiverCustomer()+"\n"
  +" Weight: "+getWeight()+"\n"+" Size: "+getVolType()+"\n"+" Date: "+getDate()+"\n"+" Packet Id: "+getPacket_�d()+"\n";
	}
}
