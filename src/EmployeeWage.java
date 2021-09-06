public class EmployeeWage
{
    public static void main(String args[])
    {
        //constants
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HR = 20;
        //variables
        int dailyWage = 0;
        int empHrs=0;

        System.out.println("Welcome to Employee Computation Program on Master Branch");
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee is full time present");
            empHrs=8;
        }
        else if (empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is part time present");
            empHrs=4;
        }
        else
        {
            System.out.println("Employee is absent");
        }
        dailyWage=(empHrs*EMP_RATE_PER_HR);
        System.out.println("Employee daily wage is "+dailyWage);
    }
}
