import java.util.*;
public class Ej{
	public static void main(String[] args){
		Scanner ENTRADA = new Scanner(System.in);
		String input = ENTRADA.nextLine();
		imprimir(input,0);
	}

	public static void imprimir(String input,int i){
		System.out.println(input.substring(0,i));
		if (i < input.length()) imprimir(input,i+1);
	}
}
