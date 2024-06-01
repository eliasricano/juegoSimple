public class Personaje {
    String nombre;
    int salud;
    int saludMax;
    double honor;
    Arma arma;
    BarraSalud barraSalud;

    Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.saludMax = salud;
        this.arma = Arma.puños;
    }

    void atacar(Personaje objetivo) {
        objetivo.salud -= this.arma.daño;
        objetivo.salud = Math.max(objetivo.salud, 0);

        objetivo.barraSalud.actualizar();
        System.out.println(this.nombre + 
        " hizo " + 
        this.arma.daño + 
        " de daño a " +
        objetivo.nombre + " con " + 
        this.arma.nombre);
    }

    void equipar(Arma arma) {
        this.arma = arma;
        System.out.println(this.nombre + " equipó " + this.arma.nombre);
    }

    void soltar() {
        if (this.arma.equals(Arma.puños)) {
            System.out.println("¡No puedes soltar tus puños!");
        } else {
            System.out.println(this.nombre + " soltó " + this.arma.nombre);
            this.arma = Arma.puños;
        }
    }
}