package week1.day1;

public class Studdent {
	
	String name = "Sanjai";
	int rollNumber = 02;
	
	public void College()
	{
		String collegeName = "GTEC";
		System.out.println("College Name       : "+ collegeName);
				
	}
	
	void printDepName(String name)
	{
		System.out.println("Department         : "+name);
	}
	
	void printSec (String name1)
	{
		System.out.println("Section            : "+name1);
	}
	
	private long regNumber()
	{
		long regNo =  501814224002L;
		return regNo;
	}

	public static void main(String[] args) {
		Studdent objName = new Studdent();
		System.out.println("Name               : "+ objName.name);
		System.out.println("Roll Number        : "+ objName.rollNumber);
		objName.College();
		objName.printDepName("MECH");
		objName.printSec("'C'");
		long reg = objName.regNumber();
		System.out.println("Registration Number: "+reg);
		
		

	}

}
