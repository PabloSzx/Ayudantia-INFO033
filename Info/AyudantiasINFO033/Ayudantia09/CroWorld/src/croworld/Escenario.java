package croworld;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Escenario extends JFrame implements KeyListener{
    Fondo background;

    private ArrayList personajes;
    private Jugador player;
   
    
    public Escenario(){
        this.setSize(220,250);
        
        player = null;
        personajes = new ArrayList();
        background = new Fondo(this.getHeight(),this.getWidth(), personajes);
        
        this.addKeyListener(this);
        this.add(background);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void agregarPersonaje(Personaje a){
        if (a instanceof Jugador) player = (Jugador)a;
        personajes.add(a);
        repaint();
    }
        
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (player != null && e.getKeyChar() == 'd'){
            caminar(3);
        }
        if (player != null && e.getKeyChar() == 'a'){
            caminar(4);
        }
        if (player != null && e.getKeyChar() == 'w'){
            caminar(2);
        }
        if (player != null && e.getKeyChar() == 's'){
            caminar(1);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    private void caminar(int orientacion){
        if (orientacion == 1){
            player.modificarY(player.verY() + 5);
            player.modificarOrientacion(1);
        }
        if (orientacion == 2){
            player.modificarY(player.verY() - 5);
            player.modificarOrientacion(2);
        }
        if (orientacion == 3){
            player.modificarX(player.verX() + 5);
            player.modificarOrientacion(3);
        }
        if (orientacion == 4){
            player.modificarX(player.verX() - 5);
            player.modificarOrientacion(4);
        }       
    }
}
