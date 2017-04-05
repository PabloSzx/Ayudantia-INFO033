import javax.swing.*;

public class EjRecursivo2{
	static String h;
	static int x = 0;
	static int lg;
	
public static void main (String[] args){
    h = JOptionPane.showInputDialog("Ingresa tu nombre:");
	lg=h.length();	
	escribe(h);
}	
static void escribe(String s){
	if (x+1<lg) {
		System.out.println(s.substring(0,x+1));
		x++;
		escribe(s);
	}else{
		System.out.println(s.substring(0,lg));
	}
	}
}
