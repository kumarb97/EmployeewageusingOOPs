/********************************
 * Purpose : to calculte wage of employee till a conditioon of maximum hours or days is reached in a month.
 *********************************/
package employeewage1;
import java.util.Scanner;

public class EmployeeWage_UC6 {

	static int isPresent = 0;
	static int dailyWage = 0;
    static int partTimeWage = 0;
    static final int wagePrHr=20;
    static int totalMonthWage = 0;
    static int totalDayWage = 0;
    static int Hrs =0;
    
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
			 Hrs = Hrs +fullDayHr + partTime;
			 System.out.println("Employee's Total wage on day " +i+ " is " +totalDayWage);			 		 
		 }
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full day hour of employee");
		int fullDayHr = sc.nextInt();
		System.out.println("Enter employees part time he worked");
		int partTime = sc.nextInt();
		System.out.println("Enter maximum days");
		int days = sc.nextInt();
		System.out.println("Enter maximum hours");
		int maxHrs = sc.nextInt();
		
		for(int i =1;i<=days;i++) {   // loop will continue till maxhrs or maxdays condition is reached
			checkemp(i);
			totaldaywage(wagePrHr,fullDayHr,partTime,i);
			totalMonthWage = totalMonthWage + totalDayWage;
			System.out.println("hours is " +Hrs);
			if(Hrs == maxHrs) {
				System.out.println("Maximum hours condition is reached of " +maxHrs);
				break;
			}
			
		}
		System.out.println("Employee's final total wage  is " +totalMonthWage);
		sc.close();

	}

}
