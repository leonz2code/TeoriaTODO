package leonz2code.org.colecciones;

import java.util.*;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("===================UTILIZANDO UN HashMap=======================");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");		map.put(15, "Ramos");
		map.put(3, "Pique");		map.put(5, "Puyol");
		map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
		map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
		map.put(18, "Pedrito");		map.put(6, "Iniesta");
		map.put(7, "Villa");

		// Imprimimos el Map con un Iterador
	//	java.util.Iterator<Integer> it = map.keySet().iterator();		// DUDA POR QUE LO PUSO ASI SI SE IMPORTO java.util.*;
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}	
System.out.println("===================FIN HashMap=======================");
System.out.println("===El resultado que tenemos es el siguiente, en el que vemos que nos da los objetos sin un \"orden lógico\":=======");
System.out.println("===================UTILIZANDO UN TreeMap=======================");		
		
Map<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
treeMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
it = treeMap.keySet().iterator();
while(it.hasNext()){
  Integer key = it.next();
  System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
	}

System.out.println("=========Con un LinkedHashMap====================");

Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
linkedHashMap.put(1, "Casillas");	linkedHashMap.put(15, "Ramos");
linkedHashMap.put(3, "Pique");		linkedHashMap.put(5, "Puyol");
linkedHashMap.put(11, "Capdevila");	linkedHashMap.put(14, "Xabi Alonso");
linkedHashMap.put(16, "Busquets");	linkedHashMap.put(8, "Xavi Hernandez");
linkedHashMap.put(18, "Pedrito");	linkedHashMap.put(6, "Iniesta");
linkedHashMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
it = linkedHashMap.keySet().iterator();
while(it.hasNext()){
  Integer key = it.next();
  System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
}

System.out.println("============El resultado que tenemos es el siguiente en el que vemos que nos ordena "
		+ "los objetos tal y como los hemos ido introduciendo:==================");



}
}
