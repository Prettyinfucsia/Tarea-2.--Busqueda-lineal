package fes.aragon.modelo;

public class Bl {
    public static int[] busquedaLineal(int[] arreglo, int valor) {
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            comparaciones++;
            if (arreglo[i] == valor) {
                return new int[]{i, comparaciones};
            }
        }
        return new int[]{-1, comparaciones};
    }
}
