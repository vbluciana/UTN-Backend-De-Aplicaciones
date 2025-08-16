package utn.back.semana01;
import java.util.Scanner;

public class Ej02ISBN {
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un número ISBN (con guiones) o 's' para salir:");
            String numberIsbn = miEscaner.nextLine();

            if (numberIsbn.equalsIgnoreCase("s")) {
                break;
            }

            String isbn = "";
            for (int i = 0; i < numberIsbn.length(); i++) {
                char c = numberIsbn.charAt(i);
                if (Character.isDigit(c)) {
                    isbn += c;
                }
            }

            if (isbn.length() != 10) {
                System.out.println("invalido");
                continue;
            }

            int suma = 0;
            for (int i = 0; i < 10; i++) {
                // Convierte el carácter a número.
                int digito = Character.getNumericValue(isbn.charAt(i));
                suma += digito * (10 - i);
            }

            if (suma % 11 == 0) {
                System.out.println("valido");
            } else {
                System.out.println("invalido");
            }
        }
    }
}