//Haciendo referencia y ayudado por ejercicio Triangulo realizado en clase
public class Rectangulo 
{
	int Base;
	int Altura;
	
	//Constructor
	Rectangulo (int Base, int Altura)
	{
		this.Base = Base;
		this.Altura = Altura;
	}
	
	//Capturando valor de variable Base
	int getBase(){
		
		//Retornando Base
		return Base;
	}
	
	//Asignando variable Base
	void setBase (int Base){
		
		//Referencia a la variable base capturada
		this.Base = Base;
	}
	
	//Capturando valor de variable Altura
	int getAltura(){
		
		//Retornando Altura
		return Altura;
	}
	
	//Asignando variable Altura
	void setAltura (int Altura){
		
		//Referencia a la varriable Altura capturada
		this.Altura = Altura;
	}
	
	//Declarando y capturando variable Area
	int getArea(){
		
		//retornando y calculando Area
		return (Base * Altura);
	}
	
	//Declarando y capturando variable Perimetro
	int getPerimetro (){
		
		//retornando y calculando Perimetro
		return (Base * 2) + (Altura * 2);
	}
	
}

