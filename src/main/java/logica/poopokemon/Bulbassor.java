
package logica.poopokemon;


public class Bulbassor extends Pokemon implements IPlanta{

    public Bulbassor() {
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
    public void atacarDrenaje() {
        System.out.println("Ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Ataque Paralizar");
    }
    
}
