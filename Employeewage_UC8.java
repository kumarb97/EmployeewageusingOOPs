package employeewage1;


public class Employeewage_UC8 {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	
	private String company;
	private int empRate;
	private int numOFDays;
	private int maxHours;
	
	    Employeewage_UC8(String company, int empRate, int numOFDays, int maxHours) {                //creating constructor for input of data
		this.company = company;
		this.empRate = empRate;
		this.numOFDays = numOFDays;
		this.maxHours = maxHours;
	}
	public int calculateEmpWageForCompany() {
		
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		int empHrs=0, empWagePerMonth = 0, totalWorkingdays=0, totalEmpHours = 0;
				
		while(totalEmpHours <= this.maxHours && totalWorkingdays < this.numOFDays) {
			
			totalWorkingdays ++;
			int empType = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			
			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * this.empRate;
			empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : "+empWagePerDay);
		}
		
		System.out.println("Emp Wage Per Month for Company "+this.company+" is Rs."+empWagePerMonth);
		return empWagePerMonth;
	}
	

	
	public static void main(String[] args) {
		
		Employeewage_UC8 tata = new Employeewage_UC8("TATA MOTORS", 30, 20, 100);          //  calculating the wage for all company. We have created the object of the company
		Employeewage_UC8 reliance = new Employeewage_UC8("RELIANCE", 40, 25, 90);
		tata.calculateEmpWageForCompany();
		System.out.println();
		reliance.calculateEmpWageForCompany();
	
	}

}
