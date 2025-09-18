import java.util.Scanner;
import java.util.Random;

public class Juego {
    int n_palos = 21;
    Scanner scanner = new Scanner(System.in);
    public void print() {
        System.out.println("    ");
        for (int i = 0; i < n_palos; i ++){
            System.out.print("|");
        }
        System.out.println("    ");
    }

    public void turnojugador() {
        Scanner scanner = new Scanner(System.in);
        int numJugador;

        do {
            System.out.print("Ingresa un número de jugador (1-4): ");
            numJugador = scanner.nextInt();

            if (numJugador > 0 && numJugador < 5) {
                this.n_palos -= numJugador;
                if (n_palos <= 0) {
                    System.out.println("Perdiste");
                    System.exit(0);
                }
                this.print();
            } else {
                System.out.println("Número fuera de rango. Inténtalo de nuevo");
            }

        } while (numJugador < 0 && numJugador > 5);
    }

    public void turnoIA() {
        System.out.println("Turno de la IA");
        int numIA;
        int resto = n_palos % 4;
        if (resto == 0) {
            Random rand = new Random();
            numIA = rand.nextInt(4) + 1;
        } else {
            numIA = resto;
        }
        System.out.println("La IA quita: " + numIA);
        n_palos -= numIA;
        if (n_palos <= 0) {
            System.out.println("Perdiste");
            System.exit(0);
        }
        this.print();

    }
}
