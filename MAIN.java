
import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.text.*;
import java.util.*;

public class MAIN {
	   //Definition of global variables and global objects
	    public static Office []offices=new Office[100];
		public static Employee[]employees=new Employee[100];
		public static Customer[]customers=new Customer[100];
		public static Packets[]packets=new Packets[100];
		public static int officeCtr = 0;
		public static int employeeCtr = 0;
		public static int customerCtr = 0;
		public static int packetCtr = 0;
		
		//this function is where the properties of the classes are added
		public static void add(String[] FileLine) 
		{
			 if(FileLine[0].equals("addOffice"))
			   { 
				   offices[officeCtr]=new Office(officeCtr+1,FileLine[1],FileLine[2],FileLine[3],FileLine[4],FileLine[5]);
				   offices[officeCtr].setTotal(0);
				   officeCtr++;
			     }
			   else if(FileLine[0].equals("addEmployee"))
			   {
				   employees[employeeCtr]=new Employee(employeeCtr+1,FileLine[1],FileLine[2],FileLine[3],FileLine[4],FileLine[5],FileLine[6],FileLine[7],FileLine[8],FileLine[9]);
				   employees[employeeCtr].setSalary(2020.58);
				   employeeCtr++;
			   }
			   else if(FileLine[0].equals("addCustomer"))
			   {
				   customers[customerCtr]=new Customer(FileLine[1],FileLine[2],FileLine[3],FileLine[4],FileLine[5],FileLine[6],FileLine[7],FileLine[8],customerCtr+1);
				   customerCtr++;
			   }
			   else if(FileLine[0].equals("addPacket"))
			  {
				   packets[packetCtr]=new Packets(FileLine[1],FileLine[2],FileLine[3],FileLine[4],FileLine[5],packetCtr+1);
				   packets[packetCtr].setStatus(0);
				   packetCtr++;
			  }
			
		}
		
		
		//this function deletes the data we want to delete and lists all data
		public static void Delete(String[] FileLine)
		{
			System.out.println("------LIST OFFICES-----"+"\n");
			offices[officeCtr]=null;
			for(int i=0; i<offices.length; i++)
			{
			
				if(offices[i]==null)
					break;
				System.out.println(offices[i].ListOffice()+
					"Total Income: "+offices[i].getTotal()+"\n");
			}
			if(FileLine[0].equals("deleteEmployee"))
			{
				System.out.println("------LIST EMPLOYEES-----"+"\n");
				employees[employeeCtr]=null;
				for(int i=0; i<employees.length; i++)
				{
					if(i==Integer.parseInt(FileLine[1])-1)
					{
						continue;
					}
					if(employees[i]==null)
						break;
					employeeCtr++;
					System.out.println(employees[i].ListEmployee()+
							" Salary: "+employees[i].getSalary()+"\n");
			    }
			}
			else if(FileLine[0].equals("deleteCustomer"))
			{
				System.out.println("------LIST CUSTOMERS-----"+"\n");
				customers[customerCtr]=null;
				for(int i=0; i<customers.length; i++)
				{
					if(i==Integer.parseInt(FileLine[1])-1)
					{
						continue;
					}
					if(customers[i]==null)
						break;
					
					System.out.println(customers[i].ListCustomer());
				}
			}
			System.out.println("------LIST PACKETS-----"+"\n");
			packets[packetCtr]=null;
			for(int i=0; i<packets.length; i++)
			{
				
				if(packets[i]==null)
					break;
				
				System.out.println(packets[i].ListPackets()+
						" Status: "+packets[i].getStatus()+"\n");
			}
			
		}
		
		//showing the prices of the packages and adding them to the total revenue
	public static void Total(String[]FileLine)
	{
		if(FileLine[0].equals("deliveryPacket"))
		{
			
			if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>=1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<=5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
			{
				 offices[Integer.parseInt(FileLine[1])-1].setTotal(10);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(15);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(20);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(25);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(30);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(40);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(45);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(50);
			}
			else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
			{
				offices[Integer.parseInt(FileLine[1])-1].setTotal(55);
			}
			 
			
		}
			
		
	}
    
	//Determining the status of the delivered packets
	public static void Deliver(String[]FileLine)
	{
			if(FileLine[0].equals("deliverPacket"))
			{
				packets[Integer.parseInt(FileLine[1])-1].setStatus(1);
			}
	 }
	
	//determining the status of the lost packets
	public static void Loss(String[]FileLine)
		{
			if(FileLine[0].equals("lossPacket"))
			{
				packets[Integer.parseInt(FileLine[1])-1].setStatus(2);
			}
		}

   //This function returns true or false when searching
	public static boolean Search(Packets info,String senderCustomer, String receiverCustomer,String status,String weight,String volType) 
	{
	     boolean flag=true;
	     int min_weight=0;
	     int max_weight=0;
	     int tempp=Integer.parseInt(info.getSenderCustomer()); // converts the sender customer ID number to a number
	     String from_city=customers[tempp-1].getCity();// customer's city according to customer ID number
	     int tmp=Integer.parseInt(info.getReceiverCustomer());
	     String to_city=customers[tmp-1].getCity();
	     if(!weight.equals(" ")&& !weight.equals("")&&weight!=null)
	     {
	        min_weight=Integer.parseInt(weight.trim().substring(0,weight.lastIndexOf('-')));//value on the right side of the character('-') equals minimum weight
	    	max_weight=Integer.parseInt(weight.trim().substring(0,weight.lastIndexOf('-')+ 1));//value on the left side of the character('-') equals maximum weight
	     }
	     if(senderCustomer!=null)
	     {
	    	 if(!from_city.equals(from_city))
	    		 flag=false;
	     }
	     if(receiverCustomer!=null)
	     {
	    	 if(!to_city.equals(to_city))
	    		 flag=false;
	     }
	     if(status!=null)
	     {
	    	 if(info.getStatus()!=0 ||info.getStatus()!=1 || info.getStatus()!=2)
	    		 flag=false;
	     }
	     if(Integer.parseInt(info.getWeight())<min_weight||Integer.parseInt(info.getWeight())>max_weight)
	     {
	    	 flag=false;
	     }
	      if(volType!=null)
	     {
	    	 if(!info.getVolType().equals(volType))
	    		 flag=false;
	     }
		return flag;	
		
	}
    public static void main(String[]args) 
	{
    	
    	// read the inputfile and split by the delimiter every line
        File inputFile1=new File("input.txt");
		try {
		Scanner scan=new Scanner(inputFile1);

							   	
		while(scan.hasNextLine())
	    {
		 String str=scan.nextLine();
		 String  FileLine[]=str.split(";");
		 String command=FileLine[0];
		
		 //scanning the file according to the first word of each line and doing the operations accordingly
		 if(command.contains("add")) 
		 {
			 add(FileLine);
		 }
		 else if(command.contains("deliver"))
		 {
			 if(FileLine[0].equals("deliverPacket"))
			 {
				 packets[Integer.parseInt(FileLine[1])-1].setStatus(1);
				 if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>=1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<=5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
					{
						 offices[Integer.parseInt(FileLine[1])-1].setTotal(10);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(15);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>1 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<5)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(20);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(25);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(30);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>6 && (Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())<10)&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(40);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("small"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(45);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("medium"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(50);
					}
					else if((Integer.parseInt(packets[Integer.parseInt(FileLine[1])-1].getWeight())>10&& (packets[Integer.parseInt(FileLine[1])-1].getVolType().equals("large"))))
					{
						offices[Integer.parseInt(FileLine[1])-1].setTotal(55);
					}
				 
			 }
		 }
		 else if(command.contains("loss"))
		 {
			 if(FileLine[0].equals("lossPacket"))
			 {
				 packets[Integer.parseInt(FileLine[1])-1].setStatus(2);
			 }
		 }
		
		
		 
		 else if(command.contains("update"))
		 {
			 if(FileLine[0].equals("updateOffice"))
			 {
				 try {
				 offices[Integer.parseInt(FileLine[1])-1].setId(Integer.parseInt(FileLine[1]));
				 offices[Integer.parseInt(FileLine[1])-1].setName(FileLine[2]);
				 offices[Integer.parseInt(FileLine[1])-1].setAddress(FileLine[3]);
				 offices[Integer.parseInt(FileLine[1])-1].setTown(FileLine[4]);
				 offices[Integer.parseInt(FileLine[1])-1].setCity(FileLine[5]);
				 offices[Integer.parseInt(FileLine[1])-1].setNumber(FileLine[6]);
				 }catch(NullPointerException n)
				 {
					 
					System.out.print(" ");
				 }
				 
			 }
			 else if(FileLine[0].equals("updateEmployee"))
			 {
				 try {
				 employees[Integer.parseInt(FileLine[1])-1].setEmployee_id(Integer.parseInt(FileLine[1]));
				 employees[Integer.parseInt(FileLine[1])-1].setOffýce_ýd(FileLine[2]);
				 employees[Integer.parseInt(FileLine[1])-1].setType(FileLine[3]);
				 employees[Integer.parseInt(FileLine[1])-1].setName(FileLine[4]);
				 employees[Integer.parseInt(FileLine[1])-1].setBirthdate(FileLine[5]);
				 employees[Integer.parseInt(FileLine[1])-1].setGender(FileLine[6]);
				 employees[Integer.parseInt(FileLine[1])-1].setAddress(FileLine[7]);
				 employees[Integer.parseInt(FileLine[1])-1].setTown(FileLine[8]);
				 employees[Integer.parseInt(FileLine[1])-1].setCity(FileLine[9]);
				 employees[Integer.parseInt(FileLine[1])-1].setPhone(FileLine[10]);
				 }catch(NullPointerException n)
				 {
					 System.out.println("Did not found employee");
				 }
			 }
			 else if(FileLine[0].equals("updateCustomer"))
			 {
				 try {
				 customers[Integer.parseInt(FileLine[1])-1].setCustomer_ýd(Integer.parseInt(FileLine[1]));
				 customers[Integer.parseInt(FileLine[1])-1].setName(FileLine[2]);
				 customers[Integer.parseInt(FileLine[1])-1].setBirthdate(FileLine[3]);
				 customers[Integer.parseInt(FileLine[1])-1].setGender(FileLine[4]);
				 customers[Integer.parseInt(FileLine[1])-1].setEmail(FileLine[5]);
				 customers[Integer.parseInt(FileLine[1])-1].setAddress(FileLine[6]);
				 customers[Integer.parseInt(FileLine[1])-1].setTown(FileLine[7]);
				 customers[Integer.parseInt(FileLine[1])-1].setCity(FileLine[8]);
				 customers[Integer.parseInt(FileLine[1])-1].setPhone(FileLine[9]);
				 } catch(NullPointerException n)
				 {
					 System.out.println("Did not found customer");
				 }
			 }
			 else if(FileLine[0].equals("updatePacket"))
			 {
				 try {
				 packets[Integer.parseInt(FileLine[1])-1].setPacket_ýd(Integer.parseInt(FileLine[1]));
				 packets[Integer.parseInt(FileLine[1])-1].setSenderCustomer(FileLine[2]);
				 packets[Integer.parseInt(FileLine[1])-1].setReceiverCustomer(FileLine[3]);
				 packets[Integer.parseInt(FileLine[1])-1].setWeight(FileLine[4]);
				 packets[Integer.parseInt(FileLine[1])-1].setVolType(FileLine[5]);
				 packets[Integer.parseInt(FileLine[1])-1].setDate(FileLine[6]);
				
				 }catch(NullPointerException n)
				 {
					 System.out.println("Did not found packets");
				 }
				 
					 
			 }
	
			 
			 
					 
		 }
		 else if(command.contains("delete"))
		 {
			 Delete(FileLine);
		 }
		 else if(command.contains("increase"))
		 {
			 employees[employeeCtr-1].setSalary((2020.58+(2020.58*10)/100));
			 System.out.println(employees[employeeCtr-1].getSalary());
		 }
		 else if(command.contains("total"))
		 {
			 System.out.println(offices[Integer.parseInt(FileLine[1])-1].getTotal());
	     }
		 else if(command.contains("trackpacket"))
		 {
		      System.out.println( packets[Integer.parseInt(FileLine[1])-1].getStatus());
         }
		 
		 
		 /* this command is not working corretly 
		 else if(command.equals("search"))
		 {
			 System.out.println("****SEARCH RESULTS****");
			 try {
				 
			 for(int k=0; k<100; k++)
			 { 
			 int fr=Integer.parseInt(packets[k].getSenderCustomer());
			 String from=customers[fr-1].getCity();
			 int to=Integer.parseInt(packets[k].getReceiverCustomer());
			 String to_cty=customers[to-1].getCity();
			
				 if(packets[k]==null)
				 {
					 continue;
				 }
				 
				 else if(packets[k]!=null && Search(packets[k],from,to_cty,FileLine[3],FileLine[4],FileLine[5]))
				 {
					packets[k].ListPackets(); 
				 }
			 }
			 }catch(NullPointerException a)
			 {
				 a.printStackTrace();
			 }
		 }
		 */
		  
  }   		
			  	
		scan.close();
		     	}catch(FileNotFoundException e)
				{
				   e.printStackTrace();
				}
		
			
	}
  
}