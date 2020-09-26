package uc8;
public class uc8 {
	public static final int PART=1;
	public static final int FULL =2;
	
	public static int empWage(int rate,int work,int maxhrs,String company) {
		// variables
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		// Computation
		while (totalEmpHrs <= maxhrs && totalWorkingDays < work) {
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case PART:
				empHrs=4;
				break;
			case FULL:
				empHrs=8;
				break;
			default:
				empHrs=0;
			
			}
			totalEmpHrs += empHrs;
			System.out.println("Number of Days:" +totalWorkingDays + " Emp Hours " +empHrs);
		}
		int totalEmpWage= totalEmpHrs*rate;
		System.out.println("Total Emp Wage for company " +company + " is " +totalEmpWage);
		return totalEmpWage;
	}
	public static void main (String[] args) {
		empWage(20,10,10,"armaan");
		empWage(10,4,20,"lemon");
	}

}
