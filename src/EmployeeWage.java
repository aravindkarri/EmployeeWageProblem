/**
 * @author Aravind
 * class to calculate employee wage for multiple companies.
 */
public class EmployeeWage
{
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    //instance variables
    public int empWagePerHour;
    public int maxWorkingDays;
    public int maxWorkingHrs;
    public String companyName;

    //constructor
    public EmployeeWage(String companyName,int empWagePerHour,int maxWorkingDays,int maxWorkingHrs)
    {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }
    /**
     * Method Name:- calculateEmployeeWage()
     * Description:- It calculates employee wages for different companies
     * Algorithm: - If while condition is true..It checks employee wage based on he is part-time or full time or absent.
     * after that it calculates employee wage for that day and continues till user given max working days,max working hrs.
     */
    public void calculateEmployeeWage()
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
            switch ((int)empCheck)
            {
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
    public static void main(String args[])
    {
        EmployeeWage bridgelabz = new EmployeeWage("Bridgelabz",20,20,100);
        bridgelabz.calculateEmployeeWage();
        EmployeeWage dmart = new EmployeeWage("Dmart",15,25,150);
        dmart.calculateEmployeeWage();
        EmployeeWage reliance= new EmployeeWage("Reliance",20,30,200);
        reliance.calculateEmployeeWage();
    }
}