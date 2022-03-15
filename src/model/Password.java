package model;

public class Password {

	final static int largo =8;
	private int longitud=largo;
	private String contrase�a;
	
	//CONTRUCTOR VACIO
	public Password() {
		// TODO Auto-generated constructor stub
	}
	
	//CONTRUCTOR EN EL QUE INGRESA CONTRASE�A POR PARAMETRO
	public Password (String contrase�a) {
		
		this.contrase�a=contrase�a;
		longitud=contrase�a.length();
	}
	
	//CONSTRUCTOR EN EL QUE SE PASA UNA LONGITUD Y CREA CONTRASE�A RANDOM
	public Password(int longitud) {
		
		this.longitud=longitud;
		
		contrase�a=getPassword(longitud);
		
		
	}
	

  //GETTERS Y SETTERS	 
		 public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContrase�a() {
			return contrase�a;
		}

   // MAYUSCULAS, MINUSCULAS Y NUMEROS A USAR EN LA CONTRASE�A RANDOM
		 String mayusculas = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";	 
		 String minusculas = "abcdefghijklmn�opqrstuvwxyz";
		 String numeros = "0123456789";
	 
	 //ES LA FUNCION QUE SE LLAMA EN EL CONSTRUCTOR EN LA QUE INGRESA LA LONGITUD QUE QUERAMOS DE LA CONTRASE�A ALEATORIA
		public  String getPassword(int longitud) {
			return getPassword(numeros + mayusculas +minusculas, longitud);
		}
	 
		//FUNCION QUE REALIZA EL TRABAJO DE CREAR CONTRASE�A CON LOS DATOS DEL PRIMER PARAMETRO Y LA LONGITUD DEL SEGUNDO
		public  String getPassword(String key, int length) {
			String pswd = "";
	 
			for (int i = 0; i < length; i++) {
				pswd+=(key.charAt((int)(Math.random() * key.length())));
			}
	 
			return pswd;
		}

		//FUNCION QUE MUESTRA ATRIBUTOS
		@Override
		public String toString() {
			return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
		}
		
		//FUNCION PARA GENERAR CONTRASE�A ALEATORIA CON LA LONGITUD POR DEFECTO
		public  String generarContrase�a() {
			return getPassword(longitud);
		}
		
		//FUNCION QUE RETORNA TRUE SI LA CONTRASE�A ES FUERTE EN BASE A CIERTAS CARACTERISTICAS DE LA CONSIGNA Y FALSE SI NO LO ES
		public boolean esFuerte() {
			
			int contadorContrase�a=0;
			int contadorMayuscula=0;
			int contadorMinuscula=0;
			int contadorNumero=0;
			int may=0,min=0,num=0;
			boolean fuerte=false;	
			
			while(contadorContrase�a<longitud) {
				
				while(contadorNumero<numeros.length()) {
					
					 if(contrase�a.charAt(contadorContrase�a)==numeros.charAt(contadorNumero)){
						  num++;
					  }
			
					  contadorNumero++;  
				}
				
				
				while(contadorMayuscula<mayusculas.length()) {
					
					 if(contrase�a.charAt(contadorContrase�a)==mayusculas.charAt(contadorMayuscula)){
						  may++;
					  }
					 contadorMayuscula++;
					 
				}
					
					while(contadorMinuscula<minusculas.length())
					{
						
						  if(contrase�a.charAt(contadorContrase�a)==minusculas.charAt(contadorMinuscula)){
							  min++;
						  }
						 

							contadorMinuscula++;
					 }
				
				 contadorMayuscula=0;
			     contadorMinuscula=0;
				 contadorNumero=0;
					
					contadorContrase�a++;	
				}

  /*        EN LA CONSIGNA DICE MAS DE 2 MAYUCULAS (3), MAS DE  3 NUMEROS(4), Y MAS DE UNA MINUSCULA(2)
   *        3+4+2= 9, PERO  LA LONGITUD TIENE QUE SER DE 8 ASI QQUE NO PODIA SER, >= A LOS NUMEROS DE LA CONSIGNA
			*/
			if(may >=2 && min >= 1 && num >=3) {
		    fuerte=true;
	    }
	
	return fuerte;
	}
		
		//FUNCION PARA MOSTRAR POR PANTALLA SI UNA CONTRASE�A ES FUERTE O DEBIL
	public String mostrar (boolean fuerte) {
		
		if(fuerte == true ) {
			
			return " contrase�a fuerte ";
		}else {
			
			 return " contrase�a debil";
		}
		
	}

 }
		
