
public class Packets {
	
	private String senderCustomer;
	private String receiverCustomer;
	private String weight;
	private String volType;
	private String date;
	private int packet_ýd;
	private int status;
	
	

	public Packets(String senderCustomer, String receiverCustomer, String weight, String volType, String date,int packet_ýd ) 
	{
		super();
		
		this.senderCustomer = senderCustomer;
		this.receiverCustomer = receiverCustomer;
		this.weight = weight;
		this.volType = volType;
		this.date = date;
		this.packet_ýd=packet_ýd;
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
	public int getPacket_ýd()
	{
		return packet_ýd;
	}
	public void setPacket_ýd(int packet_ýd)
	{
		this.packet_ýd=packet_ýd;
	}
	
	public String ListPackets()
	{
		return " Sender Customer Id: "+getSenderCustomer()+"\n"+" Receiver Customer Id: "+getReceiverCustomer()+"\n"
  +" Weight: "+getWeight()+"\n"+" Size: "+getVolType()+"\n"+" Date: "+getDate()+"\n"+" Packet Id: "+getPacket_ýd()+"\n";
	}
}
