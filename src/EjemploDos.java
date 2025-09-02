import java.util.Scanner;

public class EjemploDos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fraseEntrada = "Ingrese un numero : ";
        System.out.print(fraseEntrada);
        int numero = input.nextInt();
        boolean respuestaResibida = ParInpar(numero);
        System.out.println(respuestaResibida);
    }

    public static boolean ParInpar(int numero){
        boolean respuesta = (numero % 2 == 0);
        return respuesta;
    }
}