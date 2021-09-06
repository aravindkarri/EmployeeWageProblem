public class EmployeeWage
{
    public static void main(String args[])
    {
        int IS_EMP_PRESENT = 1;
        System.out.println("Welcome to Employee Computation Program on Master Branch");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_EMP_PRESENT)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
