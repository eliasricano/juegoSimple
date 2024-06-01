import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Héroe", 100);
        Personaje enemigo = new Personaje("Enemigo", 100);
        Scanner scan = new Scanner(System.in);
        heroe.equipar(Arma.espada);
        enemigo.equipar(Arma.arco);

        int numRondas = 5;
        int i = 0;
        while (i < numRondas) {
            limpiarConsola();
            System.out.println("RONDA " + (i + 1));
            heroe.atacar(enemigo);
            enemigo.atacar(heroe);

            heroe.barraSalud.pintar();
            enemigo.barraSalud.pintar();

            i++;
            scan.nextLine();
            scan.reset();
        }
        scan.close();
    }

    public static final void limpiarConsola() {
        System.out.println("\033c");    // Código ANSI
    }
}