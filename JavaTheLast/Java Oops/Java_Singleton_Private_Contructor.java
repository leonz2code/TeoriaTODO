Java – private constructor

The use of private constructor is to serve singleton classes. A singleton class is one which limits the number of objects creation to one. 
Using private constructor we can ensure that no more than one object can be created at a time.
By providing a private constructor you prevent class instances from being created in any place other than this very class. 
We will see in the below example how to use private constructor for limiting the number of objects for a singleton class.

Example of Private Constructor
public class SingleTonClass {
   //Static Class Reference
   private static SingleTonClass obj=null;
   private SingleTonClass(){
      /*Private Constructor will prevent 
       * the instantiation of this class directly*/
   }
   public static SingleTonClass objectCreationMethod(){
	/*This logic will ensure that no more than
	 * one object can be created at a time */
	if(obj==null){
	    obj= new SingleTonClass();
	}
        return obj;
   }
   public void display(){
	System.out.println("Singleton class Example");
   }
   public static void main(String args[]){
	//Object cannot be created directly due to private constructor 
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
	SingleTonClass myobject= SingleTonClass.objectCreationMethod();
	myobject.display();
   }
}
Output:

Singleton class Example