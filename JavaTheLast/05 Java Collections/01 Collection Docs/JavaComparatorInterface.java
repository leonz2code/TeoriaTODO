Java Comparator interface

Collections class
Collections class provides static methods for sorting the elements of a collection. If collection elements are of Set or Map, we can use TreeSet or TreeMap. 
However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements also.

Java Comparator Example (Generic)


-- Student.java

class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  


-- AgeComparator.java

import java.util.*;  
class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


NameComparator.java


This class provides comparison logic based on the name. In such case, we are using the compareTo() method of String class, which internally provides the comparison logic.

import java.util.*;  
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  


Simple.java
In this class, we are printing the values of the object by sorting on the basis of name and age.

import java.util.*;  
import java.io.*;  
class Simple{  
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new NameComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  
       Sorting by Name
       106 Ajay 27
       105 Jai 21
       101 Vijay 23

       Sorting by age     
       105 Jai 21
       101 Vijay 23
       106 Ajay 27



Java 8 Comparator interface
Java 8 Comparator interface is a functional interface that contains only one abstract method. Now, we can use the Comparator interface 
as the assignment target for a lambda expression or method reference.


https://www.javatpoint.com/Comparator-interface-in-collection-framework?fbclid=IwAR3zIJpIyLLAY4YQG6AsL3Yw7VW9yIg9vVEtThH4mYAiQ3vBn6xp5PMFz08












