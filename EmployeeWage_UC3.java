/*************************************************************************
 * Purpose : To add part time employee wage.
 * 
 **************************************************************************/
package employeewage1;

import java.util.Scanner;

public class EmployeeWage_UC3 {
		/*
		 * Function to check employee's daily wage
		 * @param wagePrHr wage per hour of employee
		 * @param fullDayHr full day hour of employee
		 */
	     static int dailyWage = 0;
	     static int partTimeWage = 0;
		 static void dailywage(int wagePrHr,int fullDayHr) {
			dailyWage = wagePrHr * fullDayHr;
			System.out.println("Employee daily wage is " +dailyWage);
		}
		
		 static void parttimewage(int partTime, int wagePrHr) {
			partTimeWage = wagePrHr * partTime;
			System.out.println("Employee part time wage is " +partTimeWage);
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter wage per hour");
			int wagePrHr = sc.nextInt();
			System.out.println("Enter full day hour of employee");
			int fullDayHr = sc.nextInt();
			System.out.println("Enter employees part time he worked");
			int partTime = sc.nextInt();
			dailywage(wagePrHr,fullDayHr);
			parttimewage(partTime,wagePrHr);
			System.out.println("Employee's Total wage is " +(dailyWage+partTimeWage));
			sc.close();

	}

}
