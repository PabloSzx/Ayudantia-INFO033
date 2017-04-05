import javax.swing.*;

public class EjRecursivo{
public static void main (String[] args){
String h = JOptionPane.showInputDialog("Ingresa tu nombre:");
	int x = 0;
	while(x<h.length()){
		System.out.println(h.substring(0,x+1));
		x++;
	}
	}
}
