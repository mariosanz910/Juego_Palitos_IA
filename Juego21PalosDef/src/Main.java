import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int juegoterminado = 0;
        System.out.println("Bienvenido al juego de los 21 palos. ¿Quisieras ver las instruccioes antes de jugar?");
        System.out.print("S/N   ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("S") || respuesta.equals("s")) {
            new Instrucciones().instruc();
        } else {
            System.out.println("¡Perfecto! Vamos a empezar el juego directamente.");
        }

        Juego juego = new Juego();
        juego.print();

        while (juegoterminado == 0){
            juego.turnojugador();
            juego.turnoIA();
        }
    }
}
