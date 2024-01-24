package classesandobjects;

public class Grade extends Student{
	String grade;
	public Grade() {
		// TODO Auto-generated constructor stub
	super();
//	grade="A";
	
	}

	public Grade(int rollno, String name, Address addr, int phy, int chem, int maths) {
		super(rollno, name, addr, phy, chem, maths);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void calculate() {
	// TODO Auto-generated method stub
	super.calculate();
	if(percent>=75)
	{
		grade=" A+";
	}else if(percent>=70 && percent<75)
	{
		grade=" A";
	}
	if(percent>=65 && percent<70 )
	{
		grade= " B+";
	}else if(percent>=60 && percent<65)
	{
		grade=" B";
	}
	if(percent>40 && percent<60)
	{
		grade=" C";
	}else if(percent<=40)
	{
		grade=" Fail";
	}
	}
	@Override
	public void display() {
	// TODO Auto-generated method stub
	super.display();
	System.out.println("Grade : "+grade);
	}
}