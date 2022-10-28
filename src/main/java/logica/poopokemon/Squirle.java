
package logica.poopokemon;


public class Squirle extends Pokemon implements IAgua{

    public Squirle() {
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
    public void atacarhidroBomba() {
        System.out.println("Ataque HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Ataque Pistola de agua");
    }
    
}
