public class Enemigo extends Personaje {
    Enemigo(String nombre, int salud, Arma arma) {
        super(nombre, salud);
        this.arma = arma;
        super.barraSalud = new BarraSalud(this, "rojo");
    }
}