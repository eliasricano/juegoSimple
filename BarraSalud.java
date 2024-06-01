public class BarraSalud {
    Personaje personaje;
    int tamaño;
    int valorMax;
    int valorActual;
    boolean tieneColor;
    String simboloRestante = "█";
    String simboloPerdido = "_";
    String barra = "|";
    static Colores colores = new Colores();
    String color = colores.valores.get("DEFAULT");

    BarraSalud(Personaje personaje, String color) {
        this.personaje = personaje;
        this.color = colores.valores.get(color.toUpperCase());
        this.valorMax = personaje.saludMax;
        this.valorActual = personaje.salud;
    }

    void actualizar() {
        this.valorActual = this.personaje.salud;
    }

    void pintar() {
        int barrasRestantes = Math.round((float) valorActual / valorMax * tamaño);
        int barrasPerdidas = this.tamaño - barrasRestantes;
        System.out.println(this.personaje.nombre + " SALUD: " + this.personaje.salud);
        System.out.println(
            this.barra +
            this.color +
            (simboloRestante.repeat(barrasRestantes)) +
            (simboloPerdido.repeat(barrasPerdidas)) +
            this.color +
            this.barra
        );
    }
}