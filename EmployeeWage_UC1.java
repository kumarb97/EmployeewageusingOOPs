/**********************************************************************
 * 
 * Purpose: To check whether employee is present or not.
 * 
 *********************************************************************/
package employeewage1;

public class EmployeeWage_UC1 {
	/*
	 * function to check employee is present or not
	 * 
	 */
	    static void checkemployee() {
		double random = Math.floor((Math.random()*10)%2);
		int isPresent = 1;
		if(random == isPresent) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {
		checkemployee();
		
	}

}
