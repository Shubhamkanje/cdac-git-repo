class Emp
{
	private int id;
	private String name;
	private int salary;
	
	Emp()
	{
		id = 101;
		name = "shubham";
		salary = 20000;
	}
	Emp(int d,String n,int s)
	{
		id = d;
		name = n;
	    salary = s;
	}
	
	 public void showEmpDetails(){
		  
		  System.out.println("Employee id = " + id);
		  System.out.println("Employee name = " + name);
		  System.out.println("Employee salary = " + salary);
		 }

}
