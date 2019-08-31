// SET CLASS 
Set<Integer> set = new HashSet<Integer>();
TreeSet sortedSet = new TreeSet<Integer>(set);
Set unique = new HashSet(); // replace with TreeSet to get them sorted


// QUEUE

Queue queueB = new PriorityQueue();
Queue<Integer> q = new LinkedList<>();

// LIST CLASS
ArrayList<String> myArrayList = new ArrayList<>();
LinkedList<String> object = new LinkedList<String>();

// MAP CLASS
HashMap<String, Integer> people = new HashMap<String, Integer>();
LinkedHashMap<String,Double> lhm = new LinkedHashMap<String,Double>();
TreeMap<String, Double> tm = new TreeMap<String,Double>(); // SORTED MAP
Hashtable<String, Integer> balance = new Hashtable<String, Integer>();

// https://www.tutorialspoint.com/ja…/java_using_comparator.htm


/* HOW TO ITERATE A MAP*/

// Display elements 
// while(i.hasNext()) {
// Map.Entry me = (Map.Entry)i.next();
// System.out.print(me.getKey() + ": ");
// System.out.println(me.getValue());
// } 
//


for (Map.Entry<String, String> entry : treeMap2.entrySet()) {
	
	System.out.println(entry.getKey() + "--> " + entry.getValue());
	
}

// SET CLASS 
Set<String> set = new HashSet<String>();
TreeSet sortedSet = new TreeSet<Integer>();

// Set<String> unique = new HashSet<String>(); // replace with TreeSet to get them sorted

// QUEUE

Queue queueB = new PriorityQueue();
Queue<String> q = new LinkedList<>();

// LIST CLASS
ArrayList<String> myArrayList = new ArrayList<>();
LinkedList<String> object = new LinkedList<String>();

// MAP CLASS
HashMap<String, Integer> people = new HashMap<String, Integer>();
LinkedHashMap<String,Double> lhm = new LinkedHashMap<String,Double>();
TreeMap<String, Double> tm = new TreeMap<String,Double>(); // SORTED MAP
Hashtable<String, Integer> balance = new Hashtable<String, Integer>();

// https://www.tutorialspoint.com/ja…/java_using_comparator.htm


/* HOW TO ITERATE A MAP*/

// Display elements 
// while(i.hasNext()) {
// Map.Entry me = (Map.Entry)i.next();
// System.out.print(me.getKey() + ": ");
// System.out.println(me.getValue());
// } 
//


System.out.println(lettersUPPER.length);


for (int i = 0; i < 10; i++) {

// FOR RANDOM INDEXING 
random_num= Math.random();
//index = (int) (random_num * 30 +20); //EJEMPLO RANGO DE 50 A 20 USANDO MATH RANDOM


System.out.println(index);

double randomDouble = Math.random();
randomDouble = randomDouble * 50 + 1;
int randomInt = (int) randomDouble;
// System.out.println(randomInt);


}




