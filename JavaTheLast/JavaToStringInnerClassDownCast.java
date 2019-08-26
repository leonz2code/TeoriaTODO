
--  Inner Class como crear un objeto innerClass
Main a = new Main(); 
Main.innerClass whaterver = a.new innerClass();

// Metodo toString() overriding

class Student{ 
int rollno; 
String name; 
String city;

Student(int rollno, String name, String city){ 
this.rollno=rollno; 
this.name=name; 
this.city=city; 
}

public String toString(){//overriding the toString() method 
return rollno+" "+name+" "+city; 
} 
public static void main(String args[]){ 
Student s1=new Student(101,"Raj","lucknow"); 
Student s2=new Student(102,"Vijay","ghaziabad");

System.out.println(s1);//compiler writes here s1.toString() 
System.out.println(s2);//compiler writes here s2.toString() 
} 
}



package leonz2code.org.colecciones;

public class Person {

void sample()
{
System.out.println("i'm working");
}

public static void main(String[] args) {
// TODO Auto-generated method stub

Object obj = new Person(); // DOWNCAST EXAMPLE AN UPPER CLASS COULD CREATE OBJECTS OF CHILD CLASS BUT WITH DOWNCASTING AS SHOWN BELOW

((Person) obj).sample(); //will this line work?

}

}










