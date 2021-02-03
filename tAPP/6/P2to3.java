/*
 * @Description: Problems 2 & 3
 * @Version: 1.0.1.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 01:39:39
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 09:28:28
 */

class Employee
{
    private String givenName;
    private String familyName;
    private int employeeNum;
    private double hourlyRate;
    private int actualHours;
    private int contractedHours;

    /**
     * An employee of a company.
     * @param givenName the employee's given name
     * @param familyName the employee's family name
     * @param employeeNum the employee's number
     * @param hourlyRate the employee's hourly rate
     * @param actualHours the employee's actual working hours
     * @param contractedHours the employee's contracted hours
     * @throws IllegalArgumentException the employee's hourly rate/actual working hours/contracted hours is invalid
     */
    public Employee(String givenName, String familyName, int employeeNum, double hourlyRate, int actualHours, int contractedHours) throws IllegalArgumentException
    {
        this.givenName = givenName;
        this.familyName = familyName;
        this.employeeNum = employeeNum;
        this.actualHours = 0;
        this.contractedHours = 0;

        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Invalid hourly rate: " + hourlyRate);
        
        this.hourlyRate = hourlyRate;

        if (actualHours < 0)
            throw new IllegalArgumentException("Invalid actual hours: " + actualHours);
    
        this.actualHours = actualHours;

        if (contractedHours < 0)
            throw new IllegalArgumentException("Invalid contracted hours: " + contractedHours);
        
        this.contractedHours = contractedHours;
    } // end constructor Employee

    /**
     * Print some basic info of an employee.
     * @return some basic info of an employee
     */
    public String printInfo()
    {
        return "Employee info: " + givenName + ' ' + familyName + " (No. " + employeeNum + ")";
    } // end method printInfo

    /**
     * Compute the employee's pay for the current month.
     * @return the employee's pay for the current month
     */
    public double computePay()
    {
        double extraHours = Math.max(actualHours - contractedHours, 0);
        double regularHours = Math.min(contractedHours, actualHours);
        return (regularHours * hourlyRate) + (1.5 * extraHours * hourlyRate);
    } // end method computePay
} // end class Employee

class P2to3
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Arvin", "Zhao", 1, 20.5, 10, 8);

        System.out.println(employee.printInfo());
        System.out.println("Employee's pay for the current month: " + employee.computePay());
    } // end main
} // end class TAPP6