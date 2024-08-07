import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numero1 = ScannerManager.leerInt(scanner, "Ingrese un número entero");
        final var numero2 = ScannerManager.leerInt(scanner, "Ingrese otro numero entero");

        scanner.close();

        imprimirSuma(numero1, numero2);
    }

    static void imprimirSuma(int numero1, int numero2) {
        System.out.printf("La suma de los 2 números es: %d%n", numero1 + numero2);
    }
}
