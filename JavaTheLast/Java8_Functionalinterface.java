INTERFACES WITH BODY

package leonz2code.org.innerClasses;

// WE CAN USER LAMBDA EXPRESSION ONLY IF INSIDE INTERFACE WE HAVE ONE METHOD
	interface Formula{ /// FUNCTIONAL INTERFACE

	double calculate(int a); // public abstract by default
	default double sqrt(int a)
	{
	return Math.sqrt(a);
	}}

class A implements Formula{

			@Override
			public double calculate(int a) {

			//throw new UnsupportedOperationException("Not supported yet");

			System.out.println("Congrats your interface with body is working ");
			return 0;
			}}

public class Java8interfacesBody {
public static void main(String[] args) {

A obj1 = new A();

obj1.calculate(5);

		// LAMBDA STYLE INTERFACE WITH BODY
		Formula f = (int a) -> {
		System.out.println("Lamnda Style; Interface with body");
		return 5;
		};

System.out.println(f.calculate(3));

}}