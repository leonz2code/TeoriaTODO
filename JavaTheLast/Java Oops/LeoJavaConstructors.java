Java Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes:
----------------------------------------------------------------------------------------------------------------------------------------------------------
Example
Create a constructor:

// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
----------------------------------------------------------------------------------------------------------------------------------------------------------
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.
However, then you are not able to set initial values for object attributes.
----------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor Parameters
----------------------------------------------------------------------------------------------------------------------------------------------------------
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y).
When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
----------------------------------------------------------------------------------------------------------------------------------------------------------
Example
public class MyClass {
  int x;

  public MyClass(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
----------------------------------------------------------------------------------------------------------------------------------------------------------
You can have as many parameters as you want:

Example
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
----------------------------------------------------------------------------------------------------------------------------------------------------------
// Beginnersbook

/*

Here we have created an object obj of class Hello and then we displayed the instance variable name of the object. As you can see that the output is BeginnersBook.com 
which is what we have passed to the name during initialization in constructor. This shows that when we created the object obj the constructor got invoked. 
In this example we have used this keyword, which refers to the current object, object obj in this example. 
*/
public class Hello {
   String name;
   //Constructor
   Hello(){
      this.name = "BeginnersBook.com";
   }
   public static void main(String[] args) {
      Hello obj = new Hello();
      System.out.println(obj.name);
   }
}
//Output:
//BeginnersBook.com
----------------------------------------------------------------------------------------------------------------------------------------------------------
//There are three types of constructors: "Default", "No-arg constructor" and "Parameterized"
----------------------------------------------------------------------------------------------------------------------------------------------------------
Default constructor:

If you do not implement any constructor it would be inserted into the code during compilation .
----------------------------------------------------------------------------------------------------------------------------------------------------------
no-arg constructor:

If you imlement constructor with no arguments is known as no-arg constructor.
----------------------------------------------------------------------------------------------------------------------------------------------------------
Parameterized constructor

Constructor with arguments(or you can say parameters) is known as Parameterized constructor. // YO DIGO ATRIBUTOS TAMBIEN 

public class Employee {

   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   Employee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	Employee obj1 = new Employee(10245,"Chaitanya");  
	Employee obj2 = new Employee(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}
Output:

Id: 10245 Name: Chaitanya
Id: 92232 Name: Negan
----------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor Chaining
----------------------------------------------------------------------------------------------------------------------------------------------------------
When A constructor calls another constructor of same class then this is called constructor chaining. 

Constructor Chaining Example

class Employee
{   
    public String empName;
    public int empSalary;
    public String address;

    //default constructor of the class
    public Employee()
    {
    	//this will call the constructor with String param
        this("Chaitanya");
    }

    public Employee(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 120035);
    }
    public Employee(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Gurgaon");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}
Output
Employee Name: Chaitanya
Employee Salary: 120035
Employee Address: Gurgaon
----------------------------------------------------------------------------------------------------------------------------------------------------------
Super()
Whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class. You can also say that the compiler inserts a super(); 
statement at the beginning of child class constructor.

class MyParentClass {
   MyParentClass(){
	System.out.println("MyParentClass Constructor");
   }
}
class MyChildClass extends MyParentClass{
   MyChildClass() {
	System.out.println("MyChildClass Constructor");
   }
   public static void main(String args[]) {
	new MyChildClass();
   }
}
Output
MyParentClass Constructor
MyChildClass Constructor
----------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor_Overloading

Constructor overloading is a concept of having more than one constructor with different parameters list, 
in such a way so that each constructor performs a different task.
----------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor Overloading Example
----------------------------------------------------------------------------------------------------------------------------------------------------------
Here we are creating two objects of class StudentData. One is with default constructor and another one using parameterized constructor. 
Both the constructors have different initialization code, similarly you can create any number of constructors with different-2 
initialization codes for different 2 purposes.

class StudentData
{
   private int stuID;
   private String stuName;
   private int stuAge;
   StudentData()
   {
       //Default constructor
       stuID = 100;
       stuName = "New Student";
       stuAge = 18;
   }
   StudentData(int num1, String str, int num2)
   {
       //Parameterized constructor
       stuID = num1;
       stuName = str;
       stuAge = num2;
   }
   //Getter and setter methods
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   public String getStuName() {
       return stuName;
   }
   public void setStuName(String stuName) {
       this.stuName = stuName;
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }

   public static void main(String args[])
   {
       //This object creation would call the default constructor
       StudentData myobj = new StudentData();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}
Output:
Student Name is: New Student
Student Age is: 18
Student ID is: 100
Student Name is: Chaitanya
Student Age is: 25
Student ID is: 555
----------------------------------------------------------------------------------------------------------------------------------------------------------
Difference between Constructor and Method

I know I should have mentioned it at the beginning of this guide but I wanted to cover everything in a flow. Hope you don’t mind :)

The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task by executing java code.
Constructors cannot be abstract, final, static and synchronised while methods can be.
Constructors do not have return types while methods do.






























