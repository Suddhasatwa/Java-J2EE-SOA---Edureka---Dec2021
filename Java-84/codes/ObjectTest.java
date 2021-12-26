class Employee 
{
	/*--- properties /member datas / instance variable ---*/
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay";
		sal = 2750.50f;
	}

	void displayDetails(){
		System.out.println(empno + " | " + name + " | "+ sal);
	}
} //Employee

class ObjectTest{
	public static void main(String[] args) 
	{
		//--- create an instance/ object of Employee type
		Employee emp = new Employee();

		//--- access the state of object using reference
		System.out.println(emp.empno + " | " + emp.name + " | "+emp.sal);

		//--- access the state of using using method
		emp.displayDetails();

		//--- change the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500f;
		emp.displayDetails();

		//--- change the state of object using method
		emp.setDetails();
		emp.displayDetails();
	}
}
