/**************************************************************
 * Purpose : To find employee's daily wage.
 * 
 *****************************************************************/
package employeewage1;
import java.util.Scanner;
public class EmployeeWage_UC2 {
	/*
	 * Function to check employee's daily wage
	 * @param wagePrHr wage per hour of employee
	 * @param fullDayHr full day hour of employee
	 */
	static void dailywage(int wagePrHr,int fullDayHr) {
		int dailyWage = wagePrHr * fullDayHr;
		System.out.println("Daily wage of Employee is " +dailyWage);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter wage per hour");
		int wagePrHr = sc.nextInt();
		System.out.println("Enter full day hour of employee");
		int fullDayHr = sc.nextInt();
		dailywage(wagePrHr,fullDayHr);
		sc.close();
			

	}

}
