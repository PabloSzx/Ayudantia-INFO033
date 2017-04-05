import java.io.*;
public class OrdenaNumeros{
	
	public static void main(String args[]){
		double listaNum[];  
		listaNum=leeNumeros("Numeros.txt");
		for (int x=0 ; x<listaNum.length ; x++){
				System.out.println(listaNum[x]);
			}
		listaNum=ordenar(listaNum);
		escribirNumeros(listaNum,"NumerosCopiados");	
	}

	public static double[] leeNumeros(String nombre_archivo){
			int numLineas=0;
			int a;
			double lista[]=null;
			try{
				FileReader filerd = new FileReader(nombre_archivo);
				BufferedReader in = new BufferedReader(filerd);
				String linea = null;
				while ((linea = in.readLine()) != null){
					numLineas++;
				}
				lista= new double[numLineas];
				in.close();
				filerd.close();
				//***************************
				filerd = new FileReader(nombre_archivo);
				in = new BufferedReader(filerd);
				linea = null;
				a=0;
				while ((linea = in.readLine()) != null){
					lista[a]=Integer.parseInt(linea);
					a++;
				}			
				in.close();
				filerd.close();	
							
			}
			catch (IOException e){
				System.out.println(e.getMessage());
			}
			return lista;	
	}

	public static double[] ordenar(double[] numeros){
		double temporal;
		for (int j = 0; j < numeros.length - 1; j++) 
		{
			for (int i = 0; i < numeros.length - 1; i++) 
			{
			if (numeros[i] < numeros[i + 1]) 
				{
				temporal = numeros[i + 1];
				numeros[i + 1] = numeros[i];
				numeros[i] = temporal;
				}
			}
		}
		return numeros;
	}	
	
	public static void escribirNumeros(double[] numeros, String nombre_archivo){
		try{
			FileWriter filewr = new FileWriter(nombre_archivo);
			BufferedWriter out = new BufferedWriter(filewr);
			String linea = null;
			for(int i=0;i<numeros.length;i++){
				
				out.write(String.valueOf(numeros[i]));
				out.newLine();
			}
			out.close();
			filewr.close();
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}

}
