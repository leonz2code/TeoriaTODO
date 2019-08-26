package projectdocumenation;

/**
 * Class <code>Employee</code> represents Employee and it is super class for... and 
 * blablabl
 * blabla
 * @author Arkadiusz Włodarczyk
 * @version 1.0.4.2 06/08/2015
 * @see projectdocumenation.Employee#Employee() 
 * @see <a href="http://video-courses-online.com" target="_blank">Video courses</a>
 */
public class Employee 
{

    public Employee() {
    }
    /**
     * This is constructor that will create an Employee with properties that will describe salary, name and surname. Do not forget to...
     * @param salary sets salary of Employee
     * @param name sets name of Employee
     * @param surname sets surname of Employee
     */
    public Employee(double salary, String name, String surname) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }
    /**
     * <pre>
     * Example:
     * Employee e = new Employee();
     * e.getName();
     * </pre>
     * @return the name of Employee
     * @since 1.0.0.0
     */
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }
    /**
     * It's gonna check if the name is the name of woman or 
     * @param name sets the name of Employee
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
      
    }
    
    /**
     * This is salary in $
     */
    private double salary;
    private String name;
    private String surname;
    
}
