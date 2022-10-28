
package logica.poopokemon;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
 
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Ataque Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Ataque LanzaLlamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Ataque Ascuas");
    }
    
}
