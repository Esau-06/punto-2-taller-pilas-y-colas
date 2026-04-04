import java.util.Scanner;
import java.util.Stack;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String texto = sc.nextLine();

        invertir(texto);
    }

    public static void invertir(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        int cantidad = cadena.length();

        String invertida = "";
        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
        System.out.println("Cantidad de caracteres: " + cantidad);
    }
}

