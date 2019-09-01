package generictype;

import java.util.ArrayList;

//WILD CARD - ? is used to restrict what parameter can be used in genertic type
class ProcessingBoxes
{
							-- HERE ANY CLASS THAT EXTENDS FROM Employee is addmited if we dont use extends then implisitly is extending of Object class which means any object is OK
    static void processBox(Box<? extends Employee> box)
    {
        
    }
}

public class GenericType 
{
    public static void main(String[] args) 
    {
        
       // Box<String> boxOfStrings = new Box<>();
        Box<Employee> boxOfEmployess = new Box<>();
        Box<SuperEmployee> boxOfSuperEmployees = new Box<>();
       // Box<Object> boxOfObjects = new Box<>();
        
        
        
        ProcessingBoxes.processBox(boxOfSuperEmployees);
    
      
    }   
}
class Employee
{
    
}

class SuperEmployee extends Employee
{
    
}
class Box<T extends Employee>
{
    T element;
    
    void setElement(T valueOfElement)
    {
        this.element = valueOfElement;
    }
    T getElement()
    {
        return this.element;
    }
}