/******************************************************************************
 * 
 * Purpose : To get employee's total wage after 20 days.
 * 
 ********************************************************************************/
package employeewage1;
import java.util.Scanner;
public class EmployeeWage_UC5 {
	
		static int isPresent = 0;
		static int dailyWage = 0;
	    static int partTimeWage = 0;
	    static final int wagePrHr=20;
	    static int totalMonthWage = 0;
	    static int totalDayWage = 0;
	    
	    /*
	     * function to check employee is present or not.
	     */
		static void checkemp(int i) {
			double random = Math.floor((Math.random()*10)%2);
			switch((int)random) {
			case 0 :
				isPresent = 1;
				System.out.println("Employee is absent on day " +i);
				break;
			case 1 :
				isPresent = 2;
				System.out.println("Employee is present on day " +i);
			}
		}
		/*
		 * function to calculate total wage of a day if employee is present.
		 * 
		 * @param wagePrHr wage per hour of employee.
		 * @param fullDayHr full day employee hour.
		 * @param partTime part time hour of employee.
		 */
		 static void totaldaywage(int wagePrHr,int fullDayHr, int partTime, int i) {
			 switch(isPresent) {
			 case 1 :
				 System.out.println("Hence no wage");
				 break;
			 case 2 :
				 dailyWage = wagePrHr * fullDayHr;
				 partTimeWage = wagePrHr * partTime;
				 totalDayWage = dailyWage + partTimeWage;
				 System.out.println("Employee's Total wage on day " +i+ " is " +totalDayWage);			 		 
			 }
		}
		
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter full day hour of employee");
			int fullDayHr = sc.nextInt();
			System.out.println("Enter employees part time he worked");
			int partTime = sc.nextInt();
			
			for(int i =1;i<=20;i++) {
				checkemp(i);
				totaldaywage(wagePrHr,fullDayHr,partTime,i);
				totalMonthWage = totalMonthWage + totalDayWage;				
			}
			System.out.println("Employee's total wage after 20 days is " +totalMonthWage);
			sc.close();

	}

}
