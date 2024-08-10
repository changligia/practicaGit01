import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio11 {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(50, 100, 20, new Random());
        final var set = obtenerValoresUnicos(array);
        imprimirSet(set);
    }

    private static Set<Integer> obtenerValoresUnicos(int[] array) {
        final var set = new HashSet<Integer>();
        for (var elemento : array) {
            set.add(elemento);
        }
        return set;
    }

    private static void imprimirSet(Set<Integer> set) {
        System.out.printf("Los valores del set son: %s%n", set);
    }
}
