*******************************************************************************************************************************************
Java Inner Classes
*******************************************************************************************************************************************
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, 
which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:
-----------------------------------------------------------------------
Example
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// Outputs 15 (5 + 10)
-----------------------------------------------------------------------
Private Inner Class   // KEY   
-----------------------------------------------------------------------
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
-----------------------------------------------------------------------
Example
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
-----------------------------------------------------------------------
Static Inner Class  // KEY
-----------------------------------------------------------------------
An inner class can also be static, which means that you can access it without creating an object of the outer class:

Example
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}

// Outputs 5
-----------------------------------------------------------------------
Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.
-----------------------------------------------------------------------
Access Outer Class From Inner Class
One advantage of inner classes, is that they can access attributes and methods of the outer class:

Example
class OuterClass {
  int x = 10; 

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class MyMainClass {
  public static void main(String args[]) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

// Outputs 10
------------------------------------------------------------------------
Anonimous Inner Class  **** JAVA 8 LAMBDA EXPRESSION PRINCIPLE ***
------------------------------------------------------------------------
an Anonimous Inner Class is when Implementation is defined after instanciation enclose by {} so class have no name, thats
why is named 'Anonimous Inner Class'
Example
public class Runner {

	public static void main(String[] args) {
		Phone p=new Phone() { // Anonimous Inner Class begin 			
				public void show() {
					System.out.println("This is an anonimous inner class"
							+ "as you can see implementation is performed"
							+ "here after instanciation");
				}};// Anonimous Inner Class end
				p.show();
	}
private interface Phone{ // Inner class/(interface in this case)
	void show();
	
}
}


