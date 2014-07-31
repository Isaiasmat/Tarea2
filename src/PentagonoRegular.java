public class PentagonoRegular {

//creando variable lado
int Lado;

//referencia a la otra variable creada
PentagonoRegular (int Lado){
	
	//"this" haciendo referencia q son dos variables lados diferentes
	this.Lado = Lado;
	}

//Capturando lado
int getLado (){
	
	//devolviendo lado
	return Lado;
	}

//Asignando lado
void setLado(int Lado){
	
	//Referencia a el lado que se captura con el set no al principal
	this.Lado = Lado;
	}

//Calculando perimetro funcion getPerimetro
int getPerimetro (){

	//calculando y devevolviendo resultado perimetro
	return (Lado * 5);
	}

public static void main(String[] args) {

	}

}
