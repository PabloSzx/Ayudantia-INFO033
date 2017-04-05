import java.io.*;
public class CuentaPalabras{
	
	public static void main(String args[]){		
		leeArchivo("Cancion.txt");				
	}

	public static void leeArchivo(String nombre_archivo){
			int numEspacios=0;
			int numLineas=0;
			int numPalabras=0;
			int car; 
			
			try{
				FileReader f = new FileReader(nombre_archivo);
				//BufferedReader in = new BufferedReader(f);
				String linea = null;
				
				while (f.ready()){	
				    car	=f.read();
					//System.out.println((char)car);
					if (car==32){ numEspacios++;
					} else 
					{ if (car==10) numLineas++;
					}
								
					//System.out.print((char)car);
			    }	
			 
			    
			    		
				//in.close();
				f.close();	
				numPalabras=numEspacios+numLineas+1;
				
				System.out.println("El numeo de palabras es: " + numPalabras);
										
			}
			catch (IOException e){
				System.out.println(e.getMessage());
			}		
	}
}
