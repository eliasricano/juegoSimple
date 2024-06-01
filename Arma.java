public class Arma {
    String nombre;
    String tipo;
    int daño;
    int valor;

    Arma(String nombre, String tipo, int daño, int valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.daño = daño;
        this.valor = valor;
    }

    static Arma espada = new Arma("Espada de Hierro", "Cuerpo a cuerpo", 10, 10);
    static Arma arco = new Arma("Arco", "Rango", 7, 5);
    static Arma puños = new Arma("Puños", "Cuerpo a cuerpo", 3, 0);
    static Arma mazo = new Arma("Mazo de bronze", "Cuerpo a cuerpo", 8, 10);
}