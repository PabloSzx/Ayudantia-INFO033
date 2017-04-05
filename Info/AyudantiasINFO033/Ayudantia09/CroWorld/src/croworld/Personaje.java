package croworld;

public class Personaje {
    private int x;
    private int y;
    private int tamaño;
    
    public void modificarX(int x){
        this.x = x;
    }
    
    public void modificarY(int y){
        this.y = y;
    }
    
    public int verX(){
        return this.x;
    }
    
    public int verY(){
        return this.y;
    }
    
    public void modificarTamaño(int t){
        tamaño = t;
    }

    public int verTamaño(){
        return tamaño;
    }
    
}
