package Minecraft;

public class Personaje {
    private final String nombrePersonaje;
    private int vidaDelJuego = 100;
    private Espada espadaPersonaje;

    public Personaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void crearEspada(Espada espadaPersonaje) {
        this.espadaPersonaje = espadaPersonaje;
    }

    public void hacerDaño(Main.Personaje personaje2) {
        if(!tieneVidaDelPersonaje(personaje2)){
            System.out.println("El personaje ya esta muerto");
            return;
        }
        personaje2.vidaDelJuego -= espadaPersonaje.golpear();
    }

    private boolean tieneVidaDelPersonaje(Main.Personaje personaje2) {
    return personaje2.vidaDelJuego > 0;
    }



    public String mostrarEstadisticas() {
        String reporte = "**********Estado del Personaje**********\n"+ nombrePersonaje;
        reporte += "\t" + vidaDelJuego + "\n";
        return reporte;
    }
}
