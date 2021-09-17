/**
 * @author Aravind
 * class to calculate employee wage for multiple companies.
 */
public class EmployeeWage
{
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    /**
     * Method name: calculateEmployeeWage
     * Description: Each company has its own wage,working hrs and days per month.This method takes company parameters
     * and can calculate wages for different companies.It follows dry principle and code reuse.
     * Algorithm : It takes company parameters and calculate the company daily wage till given condition is true
     * in the while loop. We use switch statement to check employee works for full time or part-time or absent in particular
     * day.We can get monthly wage of company wage by adding daily wage.
     * @param companyName
     * @param empWagePerHour
     * @param maxWorkingDays
     * @param maxWorkingHrs
     */
    public static void calculateEmployeeWage(String companyName,int empWagePerHour,int maxWorkingDays,int maxWorkingHrs)
    {
        //variables
        int monthlyEmpWage=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        System.out.println("Welcome to Employee Computation Program");

        while (totalWorkingDays<maxWorkingDays && totalEmpHrs<maxWorkingHrs)
        {
            int empHrs=0;
            int dailyEmpWage=0;
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is full time present");
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time present");
                    empHrs=4;
                default:
                    System.out.println("Employee is absent");
            }
            dailyEmpWage = empWagePerHour *empHrs;
            totalEmpHrs  += empHrs;
            monthlyEmpWage += dailyEmpWage;
        }
        System.out.println("Employee Wage for a month in "+companyName+ " is "+monthlyEmpWage);
    }
    public static void main(String args[]) {
        calculateEmployeeWage("Bridgelabz",20,25,100);
        calculateEmployeeWage("Reliance",20,10,200);
    }
}