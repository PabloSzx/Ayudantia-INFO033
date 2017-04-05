import java.io.*;
public class PalabrasPorLinea{
	
	public static void main(String args[]){		
		leeArchivo("Cancion.txt");				
	}

	public static void leeArchivo(String nombre_archivo){
			int numVocales=0;
			int numLineas=0;
			int numPalabras=0;
			int car; 
			String[] vocales={"a","e","i","o","u","A","E","I","O","U"};
			String carS;
			
			try{
				FileReader f = new FileReader(nombre_archivo);
				FileWriter f2 = new FileWriter("otro"+ nombre_archivo);
				BufferedWriter in = new BufferedWriter(f2);
				String linea = null;
				
				while (f.ready()){	
				    car	=f.read();
				    //System.out.println(car);
				    carS=(char)car+"";
					//System.out.println((char)car);
					if (car==10){ 
						numLineas++;
						in.write(numVocales + " vocales");
						in.newLine();
						System.out.println(numVocales + " vocales");
						numVocales=0;
					} else 
					{ for (int i=0; i<vocales.length;i++){
						if (carS.equals(vocales[i])) {
							numVocales++;
							
						}
					}
						
					}
								
					//System.out.print((char)car);
			    }	  
			    in.write(numVocales + " vocales");
				in.newLine();
				
				in.close();
				f.close();	
				f2.close();	
										
			}
			catch (IOException e){
				System.out.println(e.getMessage());
			}		
	}
}
