Lamnda Expression

package leonz2code.org.innerClasses;

// ANONIMOUS INNER CLASS

class Button extends MyOutherClass{

public Button() {}
void addAction(ActionAfterClick a) {
a.action();
}}

public class MyOutherClass {

public static void main(String[] args) {

// LAMBDA EXPRESSION ES LO MISMO QUE INNER CLASE SOLO SE REFIERE A AL IMPLEMENTACION 
// 
ActionAfterClick b =() -> {

System.out.println("Lambda Expression");
};

ActionAfterClick2 x2 =(a , z) -> (a + z);

Button p = new Button();
Button p2 = new Button();

p2.addAction(new ActionAfterClick() {

@Override
public void action() {
System.out.println("I'm action from anonymous class for button p2");
}

});

System.out.println(x2.action(10, 25));
}

interface ActionAfterClick{
void action();
}

interface ActionAfterClick2{
int action(int a, int b);
}}