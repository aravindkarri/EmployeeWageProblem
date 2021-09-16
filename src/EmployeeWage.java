public class EmployeeWage
{
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void calculateEmployeeWage()
    {
        //variables
        int salary=0;
        int empHrs=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        System.out.println("Welcome to Employee Computation Program");

        while (totalWorkingDays<=NUM_OF_WORKING_DAYS && totalEmpHrs<=MAX_WORKING_HRS)
        {
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
            totalEmpHrs += empHrs;
        }
        salary = (totalEmpHrs * EMP_RATE_PER_HR);
        System.out.println("Employee Wage for a month is "+salary);
    }
    public static void main(String args[])
    {
        calculateEmployeeWage();
    }
}
