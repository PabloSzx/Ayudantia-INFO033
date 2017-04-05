package croworld;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel{
    private Image fondo;
    private Image IMG_NPC;
    private Image IMG_PJ1;
    private Image IMG_PJ2;
    private Image IMG_PJ3;
    private Image IMG_PJ4;
    private ArrayList<Personaje> NPCs;
    
    public Fondo(int ancho, int alto, ArrayList NPCs){
        this.NPCs = NPCs;
        
        fondo = new ImageIcon(this.getClass().getResource("/Fondo.gif")).getImage();
        IMG_NPC = new ImageIcon(this.getClass().getResource("/Personaje.gif")).getImage();
        IMG_PJ1 = new ImageIcon(this.getClass().getResource("/PJ2.gif")).getImage();
        IMG_PJ2 = new ImageIcon(this.getClass().getResource("/PJ3.gif")).getImage();
        IMG_PJ3 = new ImageIcon(this.getClass().getResource("/PJ4.gif")).getImage();
        IMG_PJ4 = new ImageIcon(this.getClass().getResource("/PJ.gif")).getImage();
        
        this.setSize(ancho, alto);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        Image temp = null;;
        g.drawImage(fondo,0,0,this.getWidth(),this.getHeight(), this);
        for (int i=0;i<NPCs.size();i++){
            if (NPCs.get(i) instanceof Jugador){
                g.drawString(((Jugador)NPCs.get(i)).verNombre(),NPCs.get(i).verX()-25,NPCs.get(i).verY());
                switch ( ((Jugador)NPCs.get(i)).verOrientacion()){
                    case 1: temp = IMG_PJ1; break;
                    case 2: temp = IMG_PJ2; break;
                    case 3: temp = IMG_PJ3; break;
                    case 4: temp = IMG_PJ4; break;
                    default: temp = IMG_PJ1;break;
                }
                g.drawImage(temp,NPCs.get(i).verX(),NPCs.get(i).verY(),NPCs.get(i).verTamaño(),NPCs.get(i).verTamaño(), this);
            }
            else
                g.drawImage(IMG_NPC,NPCs.get(i).verX(),NPCs.get(i).verY(),NPCs.get(i).verTamaño(),NPCs.get(i).verTamaño(), this);
        }
    }
}
