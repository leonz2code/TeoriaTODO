-------------------------------------------------------------------------------------------------------------------------------------------------------------
What is mean by collections in Java?
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Ans: collections is a framework that is designed to store the objects and manipulate the design to store the objects.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Collections are used to perform the following operations:
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 - Searching		buscar			.contains(String)											Collections -> bamos (busqueda, almacenar, manipular, ordenar, suprimir)
 - Storing			almacenar		.add(String) .add(int index,String)  ArrayList Examples
 - Manipulation		manipular		.add(int index,String)
 - Insertion		insertar		.add(String) .add(int index,String)
 - Deletion			borrar			.remove(int index,String)
 
A group of objects is known as collections. All the classes and interfaces for collection are available in java.util package.
-------------------------------------------------------------------------------------------------------------------------------------------------------------
What are all the Classes and Interfaces that are available in the collections?
-------------------------------------------------------------------------------------------------------------------------------------------------------------
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Ans:Given below are the Classes and Interfaces that are available in Collections:
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Interfaces:

 - Collection
 - List
 - Set, - Sorted Set
 - map,  - Sorted Map
 - Queue

Classes:

	|---Java Lists:
	|		|
	|		|-- ArrayList  // ELEMENTS CAN BE DYNAMICALLY ADDED OR REMOVED FROM THE LIST, SIZE INCREASED DYNAMICALLY iNDEXSED   ELEM...0.1.2.3.4.5.6.7.9........n
	|		|		|- Methods.- boolean add(Collection c) void add(int index, Object element) void clear() int lastIndexOf(Object o) Object clone() Object[] toArray() void trimToSize();
	|		|-- Vector // similar to arrays have an index , vector implements a dynamic array and is not limited to a specific size and is synchronized. syncrhonized version of arraylist
	|		|-- LinkedList   // is a sequence of links which contains items, each link contains a connection to another link 
	|				|- Singly Linked List // Each node in this list stores the data of the node and a pointer or reference to the nex node in the list 
	|				|- Doubly Linked List // Has two references: one to the next node and another to previous node 
	|				|- Methods.- boolean add(Object c) boolean contains(Object o) void add(int index, Object element) void addFirst(Object o) void addLast(object o) int size() 
	|				|			 boolean remove(Object o) int indexOf(Object element) int lastIndexOf(Object element)
    |
	|-----Sets:
	|	
	|	- Hashset
	|	- Linked HashSet
	|	- TreeSet            // SORTED VERSION OF HashSet
	|	
	|-----Maps:
	|	
	|	- HashMap           // HashMap is the implementation of Map, but it doesn't maintain any order.
	|		Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.
	|	- HashTable
	|	- LinkedHashedMap   // LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	|		Inserta en el Map los elementos en el orden en el que se van insertando; es decir, que no tiene una ordenación de los elementos como tal, 
	|		por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases.
	|	- TreeMap           // TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	|		El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros (como luego veremos), los ordena de menos a mayor.
	|
	|	     Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos
	|	     predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
	|	     Map<Integer, String> nombreMap = new HashMap<Integer, String>();
	|	     nombreMap.size(); // Devuelve el numero de elementos del Map
	|	     nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
	|	     nombreMap.put(K clave, V valor); // Añade un elemento al Map
	|	     nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
	|	     nombreMap.clear(); // Borra todos los componentes del Map
	|	     nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
	|	     nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
	|	     nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
	|	     nombreMap.values(); // Devuelve una "Collection" con los valores del Map
	|
	|	
	|-----Queue: // follows FIFO approach Fist In First Out manner, The first element is removed first and last element is removed in the end 
			|- Methods.- boolean add(object) boolean offer(object) Object remove() Object poll() Object element() Object peek()
		
		- Priority Queue
 
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Explain about Map and their types.
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Ans: Map cares about unique identifier. We can map a unique key to a specific value. It is a key/value pair. We can search a value, based on the key. 
Like set, Map also uses “equals()” method to determine whether two keys are same or different.

HashMap:

 - Unordered and unsorted map.
 - HashMap is a good choice when we don't care about the order.
 - It allows one null key and multiple null values.

HashTable:

 - like Vector key, methods of the class are synchronized.
 - Thread-safe and therefore slows the performance
 - doesn't allow anything that is null

Linked Hash Map:

 - Maintains insertion order.
 - Slower than HashMap.
 - Can expect a faster iteration.

TreeMap:

 - Sorted Map.
 - Like Tree set, we can construct a sort order with the constructor
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Iterator 
-------------------------------------------------------------------------------------------------------------------------------------------------------------
	The Iterator interface provides the facility of iterating the elementes only in a forward direction.
	
Methods.- public boolean hasNext(); public Object netxt(); public void remove();
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Iterable
-------------------------------------------------------------------------------------------------------------------------------------------------------------
	The Iterable interface is the root interface for all the collections classes. The Collection interface along with all its subclassas also implement the Iterable interface. 

Methods.- Iterator<T> iterator();
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Collection
-------------------------------------------------------------------------------------------------------------------------------------------------------------
	Collection interface is implemented by all the classes in the collection framework and declares the methods that every collection will contain.

Methods.- Boolean add(Object obj) Boolean addAll(Object obj) void clear() .. ..  etc





































