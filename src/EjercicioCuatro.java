
import java.util.Scanner;

public class EjercicioCuatro {
    

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numberOne = input.nextInt();
      int numberTwo = input.nextInt();
      int resultado = sumar(numberOne, numberTwo);  
      System.out.println(resultado);

      


    }

    public static int sumar(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}

