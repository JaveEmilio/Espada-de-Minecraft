

public class Main {
    public static void main(String[] args) {
        Minecraft minecraft = new Minecraft(new Enemigo(NumeroDeVida.ENEMIGO));
        Personaje usuario1 = minecraft.generarPersonaje(new Usuario(NumeroDeVida.USUARIO));
        Personaje usuario2 = minecraft.generarPersonaje(new Usuario(NumeroDeVida.USUARIO));
        usuario1.golpear(new Objeto());
        usuario1.golpear(new Cerdo());
        usuario1.golpear(usuario2);
        //golpea de diferentes formas y te permite establecer polimosfirmo dependiendo de objeto te paso
        usuario1.recolectar();
        usuario1.craftear();
        usuario1.ponerBloque();
        usuario1.regenerar();


    }
}