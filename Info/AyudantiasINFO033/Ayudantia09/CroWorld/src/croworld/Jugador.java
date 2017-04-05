package croworld;

public class Jugador extends Personaje{
    private String nombre;
    private int orientacion; // 1: Mirando hacia abajo, 2: Mirando hacia arriba, 3: Hacia la derecha, 4: Hacia la izquierda
    
    public void modificarNombre(String n){
        nombre = n;
    }
    
    public String verNombre(){
        return nombre;
    }
    
    public void modificarOrientacion(int mod){
        orientacion = mod;
    }
    
    public int verOrientacion(){
        return orientacion;
    }
}
