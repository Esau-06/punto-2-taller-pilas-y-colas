import java.util.Stack;

public class Metodos {
    public void InvertirCadena(String cadena){
    Stack<Character> pila = new Stack<>();
    String invertida = "";
    int cantidad = 0;

    //recorrer la cadena
    for (int i = 0; i < cadena.length(); i++) {
        pila.push(cadena.charAt(i));
        cantidad++;
    }

    //Sacar de la pila
    while (!pila.isEmpty()) {
        invertida += pila.pop();
    }

    System.out.println("Cadena original: " + cadena);
    System.out.println("Cadena invertida: " + invertida);
    System.out.println("Cantidad de caracteres: " + cantidad);

    }



}
