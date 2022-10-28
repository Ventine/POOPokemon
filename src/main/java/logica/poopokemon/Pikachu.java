
package logica.poopokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
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
    public void atacarImpactTrueno() {
        System.out.println("Ataque ImpactTrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Ataque Puño Trueno");
    }
    
}
