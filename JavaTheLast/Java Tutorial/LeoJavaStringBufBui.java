-----------------------------------------------------------------------------------------------------------------------------------
Diferencias entre String, StringBuffer y StringBuilder, Java
-----------------------------------------------------------------------------------------------------------------------------------
String
-----------------------------------------------------------------------------------------------------------------------------------
String es un objeto inmutable (una vez creado no se puede cambiar). El objeto creado como un String se almacena en la Constant String Pool.
Cada objeto inmutable en Java es seguro para su utilización en los hilos, que implica que el String es thread safe. Un String no puede ser 
utilizado por dos hilos simultáneamente. Una vez asignado un valor a un String este no se puede modificar.

tring demo = "Hola"; // El objeto anterior se almacena en la Constant String Pool y su valor no se puede modificar.

demo = "Adiós"; // El nuevo String "Adiós" se crea en la Constant String Pool y es referenciado por la variable demo

//El String "Hola" todavía existe en la Constant String Pool y su valor no se sobreescribe pero perdimos la referencia al String "hola"
-----------------------------------------------------------------------------------------------------------------------------------
StringBuffer
-----------------------------------------------------------------------------------------------------------------------------------
StringBuffer es mutable significa que podemos cambiar el valor del objeto. El objeto creado a través de StringBuffer se almacena en el Heap. 
StringBuffer tiene los mismos métodos que el StringBuilder, pero cada método en el StringBuffer es sincronizado, 
esto quiere decir que StringBuffer estara protegido al usarse en hilos , es thread safe.

Debido a esto no se permite que dos hilos puedan acceder simultáneamente a el mismo método. Cada método se puede acceder por un hilo a la vez.
Pero al estar protegido en los hilos tiene desventajas en el rendimiento del StringBuffer. Así StringBuilder es más rápido que el StringBuffer 
al llamar a los mismos métodos de cada clase.

En el StringBuffer el valor puede ser modificado, significa que se puede asignar un nuevo valor. Hoy en día es una de las preguntas de entrevista más común, 
las diferencias entre las clases anteriores. StringBuffer se puede convertir a String mediante el uso del método toString().

StringBuffer demo1 = new StringBuffer ("Hola");
// El objeto anterior se almacena en el Heap y su valor se puede modificar.
demo1 = new StringBuffer ("Adiós");
// La declaración anterior es correcta, ya que modifica el valor que se encuentra en el StringBuffer
-----------------------------------------------------------------------------------------------------------------------------------
StringBuilder
-----------------------------------------------------------------------------------------------------------------------------------
StringBuilder es igual que StringBuffer, se almacena el objeto en el Heap y también se puede modificar. 
La principal diferencia entre el StringBuffer y el StringBuilder es que StringBuilder no es seguro al utilizarse en hilos.
StringBuilder es rápido ya que no es seguro al utilizarse en los hilos, no es thread safe.

StringBuilder demo2 = new StringBuilder ("Hola");
// El objeto anterior también se almacena en el heap y su valor puede ser modificado
demo2 = new StringBuilder ("Adiós");
// La declaración anterior es correcta, ya que modifica el valor que se encuentra en el StringBuilder
-----------------------------------------------------------------------------------------------------------------------------------
¿ Qué es la Constant String Pool ?
-----------------------------------------------------------------------------------------------------------------------------------
Se trata de una zona de memoria donde se almacenan las referencias a los objetos String. De esta manera, cada vez que se crea un String, 
la máquina virtual de Java primero comprueba si la cadena se encuentra en el String Constant Pool, si la cadena ya existe devuelve la referencia a la cadena existente, 
y si la cadena no existe se crea un nuevo objeto String, cuya referencia es colocada en la String Constant Pool gracias a esto 
se evita tener en memoria muchos objetos de tipo String con el mismo contenido. Además, 
los objetos String apuntados en la String Constant Pool nunca son elegibles por el recolector de basura, ya que la referencia a estos objetos siempre esta en uso. 
debido a estas dos características se consiguió optimizar el rendimiento de las aplicaciones y el uso de memoria.
-----------------------------------------------------------------------------------------------------------------------------------
Conclusion:
-----------------------------------------------------------------------------------------------------------------------------------
Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable.
StringBuffer and StringBuilder are similar, but StringBuilder is faster and preferred over StringBuffer for single threaded program. 
If thread safety is needed, then StringBuffer is used.


class Geeksforgeeks 
{ 
    // Concatenates to String 
    public static void concat1(String s1) 
    { 
        s1 = s1 + "forgeeks"; 
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("forgeeks"); 
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("forgeeks"); 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "Geeks"; 
        concat1(s1);  // s1 is not changed 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Geeks"); 
        concat2(s2); // s2 is changed 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer("Geeks"); 
        concat3(s3); // s3 is changed 
        System.out.println("StringBuffer: " + s3); 
    } 
} 
Output:

String: Geeks
StringBuilder: Geeksforgeeks
StringBuffer: Geeksforgeeks






































