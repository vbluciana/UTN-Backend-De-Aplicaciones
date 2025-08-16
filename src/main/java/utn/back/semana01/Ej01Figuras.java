package utn.back.semana01;

public class Ej01Figuras {
    public static void main(String[] args) {
        // Imprime la Figura 1 (i son las filas y j las columnas)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print('*');
                // Imprime un espacio después del asterisco, excepto en la última columna.
                if (j < 5) System.out.print(' ');
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
        System.out.println();

        // Imprime la Figura 2
        for (int i = 0; i < 4; i++) {
            // Imprime un espacio antes de los asteriscos en las filas impares
            if (i % 2 == 1) System.out.print(' ');
            for (int j = 0; j < 6; j++) {
                System.out.print('*');
                if (j < 5) System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

        // Imprime la Figura 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                if (j < i) System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

        // Imprime la Figura 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                if (j < i) System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                if (j < i) System.out.print(' ');
            }
            System.out.println();
        }
    }
}
