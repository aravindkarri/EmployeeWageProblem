public class EmployeeWage
{
    public static void main(String args[])
    {
        int IS_EMP_PRESENT = 1;
        int EMP_HRS = 8;
        int EMP_RATE_PER_HR = 20;
        int dailyWage = 0;
        System.out.println("Welcome to Employee Computation Program on Master Branch");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_EMP_PRESENT)
        {
            System.out.println("Employee is present");
            dailyWage = (EMP_HRS * EMP_RATE_PER_HR);
            System.out.println("Employee daily wage is: " +dailyWage);
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
