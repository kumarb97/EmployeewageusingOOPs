/*******************************************************************************
 * 
 * Purpose : To check if employee is present,if he is than his total wage should be calculated using switch case
 * 
 ***********************************************************************************/
package employeewage1;
import java.util.Scanner;

public class EmloyeeWage_UC4 {
	// variables
	static int isPresent = 0;
	static int dailyWage = 0;
    static int partTimeWage = 0;
    
    /*
     * function to check employee is present or not.
     */
	static void checkemp() {
		double random = Math.floor((Math.random()*10)%2);
		switch((int)random) {
		case 0 :
			isPresent = 1;
			System.out.println("Employee is absent");
			break;
		case 1 :
			isPresent = 2;
			System.out.println("Employee is present");
		}
	}
	/*
	 * function to calculate total wage if employee is present.
	 * 
	 * @param wagePrHr wage per hour of employee.
	 * @param fullDayHr full day employee hour.
	 * @param partTime part time hour of employee.
	 */
	 static void totalwage(int wagePrHr,int fullDayHr, int partTime) {
		 switch(isPresent) {
		 case 1 :
			 System.out.println("Hence no wage");
			 break;
		 case 2 :
			 dailyWage = wagePrHr * fullDayHr;
			 System.out.println("Employee's daily wage is " +dailyWage);
			 partTimeWage = wagePrHr * partTime;
			 System.out.println("Employee's part time wage is " +partTimeWage);
			 System.out.println("Employee's Total wage is " +(dailyWage+partTimeWage));			 		 
		 }
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter wage per hour");
		int wagePrHr = sc.nextInt();
		System.out.println("Enter full day hour of employee");
		int fullDayHr = sc.nextInt();
		System.out.println("Enter employees part time he worked");
		int partTime = sc.nextInt();
		checkemp();
	    totalwage(wagePrHr,fullDayHr,partTime);
		sc.close();

	}

}
