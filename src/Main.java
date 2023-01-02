import Minecraft.Espada;
import Minecraft.Personaje;

public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("STEVE");
        Personaje personaje2 = new Personaje("HERO");

        personaje1.crearEspada(new Espada());
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);
        personaje1.hacerDaño(personaje2);


        System.out.println(personaje2.mostrarEstadisticas());

    }
}