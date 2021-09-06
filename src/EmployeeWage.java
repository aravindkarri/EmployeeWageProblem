public class EmployeeWage
{
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int TOTAL_WORKING_DAYS = 20;

    public static void main(String args[])
    {
        //variables
        int dailyWage = 0;
        int salary=0;
        int empHrs=0;
        System.out.println("Welcome to Employee Computation Program on Master Branch");

        for ( int day=0;day<TOTAL_WORKING_DAYS;day++)
        {

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
            dailyWage=(empHrs*EMP_RATE_PER_HR);
            salary += dailyWage;
        }
        System.out.println("Employee Wage for a month is "+salary);
    }
}
