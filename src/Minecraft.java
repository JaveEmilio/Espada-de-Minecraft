public class Minecraft {
    private Personaje[] personajes;
    private int numeroAux;

    public Minecraft(Personaje personaje) {
        this.personajes = new Personaje[20];
        this.personajes[++numeroAux] = personaje;
    }

    public Personaje generarPersonaje(Usuario usuario) {
        personajes[++numeroAux] = usuario;
        return personajes[numeroAux];
    }
}
