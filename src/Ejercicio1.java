import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numero1 = ScannerManager.leerInt(scanner, "Ingrese un número entero");
        final var numero2 = ScannerManager.leerInt(scanner, "Ingrese otro numero entero");

        scanner.close();

        final var suma = sumarNumeros(numero1, numero2);
        imprimirSuma(suma);
    }

    private static int sumarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static void imprimirSuma(int suma) {
        System.out.printf("La suma de los 2 números es: %d%n", suma);
    }
}
