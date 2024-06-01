public class Heroe extends Personaje {
    Arma armaDefault;

    Heroe(String name, int salud) {
        super(name, salud);
        this.armaDefault = arma;
        super.barraSalud = new BarraSalud(this, "verde");
    }
}