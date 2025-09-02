
import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String comentario = "Ingrese el nombre : ";
        System.out.print(comentario);
        String nombre = input.nextLine();
        Parametros(nombre);
        input.close();
    }


    public static void Parametros(String nombre) {
        System.out.println("Hola, "+ nombre);
    }
}
