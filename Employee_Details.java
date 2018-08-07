class Employee{
	
	int empNo;
	String empName;
	String joinDate;
	char desigCode;
	String designation;
	String dept;
	int basic;
	int hra;
	int it;
	int da;
	
	public Employee(int empNo, String empName, String joinDate, char desigCode, String dept, int basic, int hra, int it){
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.desigCode = desigCode;
		this.dept = dept;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
		
		switch(desigCode){			
		case 'e':
			designation = "Engineer";
			da = 20000;
			break;
		case 'c':
			designation = "Consultant";
			da = 32000;
			break;
		case 'k':
			designation = "Clerk";
			da = 12000;
			break;
		case 'r':
			designation = "Receptionist";
			da = 15000;
			break;
		}			 
	}
	
	public int calculateSalaray(int empNo){
		
			return basic+hra+da-it;					
	}
}

class Employee_Details{
	
	public static void main(String[] args) {
		
		int empNo = Integer.parseInt(args[0]);
		Employee emp[] = new Employee[7];
		
		emp[0] = new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
		emp[1] = new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
		emp[2] = new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
		emp[3] = new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
		emp[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
		emp[5] = new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400);
		emp[6] = new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);		
		
		for(int i=0;i<emp.length;i++){			
			if(emp[i].empNo == empNo){
				System.out.println("Emp No. \t Emp Name \t Department \t Designation \t Salary");
				System.out.println(emp[i].empNo + "\t\t" + emp[i].empName + "\t\t" + emp[i].dept + "\t\t" + emp[i].designation + "\t" + emp[i].calculateSalaray(emp[i].empNo));
			}			
		}
	}
}