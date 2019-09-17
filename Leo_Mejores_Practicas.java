-------------------------------------------------------------------------------------------------------------------------------------------
EN TU CODIGO USA VARIABLES REFERENTES AL PROBLEMA QUE ESTAS ENFRENTANDO DE ESA MANERA ES MAS FACIL ENTENDERLO PARA TI O PARA OTRO PROGRAMADOR

-------------------------------------------------------------------------------------------------------------------------------------------
PSEUDOCODIGO

ENTENDER PERFECTAMENTE EL PROBLEMA YA NOS LLEVA A LA MITAD DE EL CAMINO, para todo codigo que se ha de desarrollar , hay que entender
perfectamente que se necesita, de otra forma solo viendo resultados esperados no sera suficiente.

ESTRUCTURA DE DATOS Y ALGORITMOS 

Algoritmo su Definicion  (requsitos , Entradas , salidas , condiciones )
Algoritmo su Eficiencia  f(n)
Analisis de Rendimiento  T(n)
Notacion O-Grande 		 O(n) no tasion asintotica

-------------------------------------------------------------------------------------------------------------------------------------------

PARA MEJORAR EN LAS VALIDACIONES

Pon las validaciones siempre al inicio del codigo se ejecutan de la 1 a la .... n 

ejemplo

public static boolean myMethod(int month){

static pon las validaciones/excepciones al inicio del methodo 

if(month>12 || month<1){
	
	return false;
}

return false;
}


-------------------------------------------------------------------------------------------------------------------------------------------
 PARA PENSAR COMO PROGRAMADAOR VER ESTE TIPO DE SOLUCIONES YA ESTABA PENSANDO EN UN ARRAYLIST TODO LOCO , IGUAL FUNCIONARIA PERO MUY INEFICIENTE BUSCAR ESTE TIPO DE SOLUCIONES 
 CUANDO TENGAS UN TIPO DE OPERACION MATEMATICA COMO ESTA , BUSCA LAS DIFERENTES FORMAS DE RESOLVERLO NO TE QUEDES SOLO CON LA TUYA 

	public static int getGreatestCommonDivisor(int first,int second) {
		if(first<10 || second<10) {
			
			return -1;
		}

       while(first != second) {
            if(first>second)
            	first= first-second;
            else
            	second= second -first;
        }
    	return first;
}













