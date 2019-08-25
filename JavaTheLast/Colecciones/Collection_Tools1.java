package leonz2code.org.colecciones;

import java.util.ArrayList;

public class Runner {

static final int[] numbers = {1,2,3,4,5,6,7,8,9,0};

static final char[] lettersLOW = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

static final char[] lettersUPPER = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

static final String[] names_Male_esp = 
{"Santiago","Sebastián","Diego","Nicolás","Samuel","Alejandro","Daniel","Mateo","Ángel","Matías","Gabriel","Tomás","David","Emiliano","Andrés","Joaquín","Carlos","Alexander","Adrián","Lucas","Benjamín","Leonardo",
"Rodrigo","Felipe","Francisco","Pablo","Martín","Fernando","Isaac","Manuel","Juan Pablo","Emmanuel","Emilio","Vicente","Eduardo","Juan","Javier","Jorge","Aaron","José","Erick","Luis","Cristian","Ignacio",
"Christopher","Jesús","Kevin","Juan José","Agustín","Juan David","Simón","Joshua","Maximiliano","Miguel Ángel","Juan Sebastián","Bruno","Iván","Gael","Miguel","Thiago","Jerónimo","Hugo","Ricardo","Antonio",
"Ian","Anthony","Pedro","Rafael","Jonathan","Esteban","Juan Manuel","Julián","Mauricio","Oscar","Santino","Axel","Sergio","Guillermo","Matthew","Valentín","Bautista","Álvaro","Dylan","Marcos","Kimberly",
"Luciano","Mario","César","Cristóbal","Luca","Iker","Juan Andrés","Gonzalo","Roberto","Valentino","Facundo","Patricio","Diego Alejandro","Josué","Franco"};

static final String[] names_Female_esp =
{"Sofía","Isabella","Valentina","Emma","Martina","Lucía","Victoria","Luciana","Valeria","Camila","Julieta","Ximena","Sara","Daniela","Emilia","Renata","Mía","Catalina","Julia","Elena","Olivia","Regina","Paula",
"Natalia","Mariana","Samantha","María","Antonella","Gabriela","Emily","María José","Zoe","Alma","Alejandra","Andrea","Noa","Alba","Aitana","Amanda","Abril","Miranda","Salomé","Ana Sofía","Carla","Alexa","Juana",
"Ivanna","Allison","Guadalupe","Antonia","Fernanda","Delfina","Romina","Luna","Lola","Paulina","Josefina","Ana","Carmen","María Fernanda","Agustina","Abigail","Ana Paula","Maite","Amelia","Brianna","Nicole",
"Francesca","Chloe","Clara","Constanza","Isabel","Claudia","Laura","Adriana","Maia","Josefa","Ariana","Alicia","Danna","Elisa","Melissa","Leire","María Paz","Ainhoa","Violeta","Ariadna","Laia","Carolina",
"Juliana","Rafaela","Valerie","Trinidad","Aurora","Elizabeth","Pilar","Ashley","Carlota","Candela","María Victoria"};

static final String[] secondNames_esp = 
{"Lopez","Martinez","Garcia","Gonzalez","Hernandez","Perez","Rodriguez","Gutierrez","Sanchez","Espinoza","Flores","Ruiz","Mendoza","Reyes","Cruz","Diaz","Castillo","Gomez","Rivera","Morales","Herrera","Urbina",
"Centeno","Jarquin","Castro","Ramirez","Chavarria","Blandon","Rivas","Davila","Torrez","Mejia","Romero","Aguilar","Mendez","Obando","Calero","Miranda","Orozco","Velasquez","Alvarez","Vargas","Moreno","Sequeira",
"Zamora","Ortiz","Arauz","Zeledon","Duarte","Amador","Jimenez","Silva","Rojas","Muñoz","Rios","Alvarado","Medina","Rocha","Sevilla","Palacios","Mercado","Suarez","Ramos","Torres","Valle","Molina","Tellez",
"Vasquez","Gaitan","Aguirre","Mairena","Altamirano","Estrada","Soza","Salgado","Aleman","Picado","Pineda","Jiron","Chavez","Rizo","Mayorga","Bermudez","Ortega","Meza","Rugama","Castellon","Solis","Calderon",
"Cano","Olivas","Narvaez","Montenegro","Sandoval","Rosales","Zelaya","Guevara","Talavera","Vega","Padilla","Peralta","Vanegas","Campos","Salazar","Guzman","Tercero","Guerrero","Guido","Pavon","Hurtado","Acuña",
"Mora","Baltodano","Acevedo","Murillo","Leiva","Oporta","Barrera","Corea","Rayo","Cerda","Blanco","Canales","Laguna","Luna","Zapata","Marin","Valdivia","Cortez","Delgado","Aragon","Salinas","Bravo","Fonseca",
"Bonilla","Maradiaga","Juarez","Lira","Zuñiga","Galeano","Palma","Tinoco","Lacayo","Solano","Aburto","Fernandez","Medrano","Mena","Escobar","Munguia","Ochoa","Ordoñez","Solorzano","Quintero","Arias","Pena",
"Obregon","Membreño","Lazo","Montoya","Nuñez","Navarrete","Ponce","Artola","Treminio","Suazo","Gonzales","Figueroa","Marenco","Vallecillo","Fuentes","Cuadra","Matamoros","Arguello","Vallejos","Rostran","Quiroz",
"Cardenas","Navarro","Vilchez","Moran","Vivas","Moncada","Granados","Huete","Siles","Loaisiga","Guillen","Guadamuz","Robleto","Toruño","Mendieta","Caceres","Benavides","Alfaro","Montiel","Parrales","Sandino",
"Lara","Saenz"};


public static void main(String[] args) {
// TODO Auto-generated method stub
int ctr1 = 0;
int ctr2 = 0;
int ctr3 = 0;
int ctr4 = 0;

double random_num;
int index;

ArrayList<String> myArrayList = new ArrayList<>();

System.out.println(lettersUPPER.length);


for (int i = 0; i < 100; i++) {
/* FOR RANDOM INDEXING 
random_num= Math.random();
index = (int) (random_num * 1000);
*/

if(ctr1>lettersUPPER.length-1) {
ctr1 = 0;
}


myArrayList.add(""+lettersUPPER[ctr1]+i);
ctr1++;


}


for (String st1 : myArrayList) {
System.out.println(st1);
}


}

}