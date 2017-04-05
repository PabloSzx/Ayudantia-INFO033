package croworld;

public class CroWorld {
    public static void main(String[] args) {
        Escenario JUEGO = new Escenario();
        
        Personaje P1 = new Personaje();
        P1.modificarX(20);
        P1.modificarY(30);
        P1.modificarTamaño(20);
        
        Jugador J1 = new Jugador();
        J1.modificarNombre("Ash Ketchup");
        J1.modificarX(100);
        J1.modificarY(70);
        J1.modificarOrientacion(1);
        J1.modificarTamaño(20);

        JUEGO.agregarPersonaje(P1);
        JUEGO.agregarPersonaje(J1);
    }
}
