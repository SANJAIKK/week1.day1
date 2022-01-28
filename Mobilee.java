package week1.day1;

public class Mobilee {
	
	public void sendMsg()
	{
		System.out.println("Hellow");
	}
	
	private long makeCall()
	{
		long mobileNumber = 88264512345L;
		return mobileNumber;
		
	}
	
	void saveContact(String name)
	{
		System.out.println("Name" +name);
	}

	public static void main(String[] args) {
		String contactName = "          : KSK";
		String Name = "SANJAI";
		Mobilee objName = new Mobilee();
		objName.sendMsg();
		objName.saveContact(contactName);
		long number = objName.makeCall();
		System.out.println("Mobile number : "+number);
		System.out.println("Hi..."+Name);
		
		
		

	}

}
