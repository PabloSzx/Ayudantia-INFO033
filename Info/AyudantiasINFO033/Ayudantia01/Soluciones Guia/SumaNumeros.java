import java.io.*;
public class SumaNumeros{
	
	public static void main(String args[]){
		double listaNum[];  
		System.out.println(leeNumeros("Numeros.txt"));		
	}

	public static int leeNumeros(String nombre_archivo){
			int numLineas=0;
			int a;
			int suma=0;
			try{
				FileReader filerd = new FileReader(nombre_archivo);
				BufferedReader in = new BufferedReader(filerd);
				String linea = null;				
				while ((linea = in.readLine()) != null){
					numLineas++;
					suma = suma + Integer.parseInt(linea);
				}				
				in.close();
				filerd.close();
				//***************************											
			}
			catch (IOException e){
				System.out.println(e.getMessage());
			}
			return suma;	
	}
}
