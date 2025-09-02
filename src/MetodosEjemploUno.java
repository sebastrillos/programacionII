
import java.util.Scanner;




public class MetodosEjemploUno {


    public static void main(String[] args) {
        Principal();
    }

    //metodos para calculadora

    
    public static void Principal(){

        Scanner input = new Scanner(System.in);
        String error = "Error";
        String salir = "Saliendo de la calculadora. ¡Adiós!";

        while (true) { 
           String operacion = input.nextLine();
           
           String operador = "";
           int indiceOperador = -1;
           


           if (operacion.equalsIgnoreCase("salir")) {
                System.out.println(salir);
                break; 
            }


           if (operacion.contains("+")) {

               indiceOperador = operacion.indexOf("+");
               operador = "+";

           } else if (operacion.contains("-")) {

                indiceOperador = operacion.indexOf("-");
                operador = "-";
               
           } else if(operacion.contains("*")) {

                indiceOperador = operacion.indexOf("*");
                operador = "*";

           }else if(operacion.contains("/")) {

                indiceOperador = operacion.indexOf("/");
                operador = "/";
                
           }


           if (indiceOperador == -1) {
                System.out.println(error);
                return;
           }

           String numeroUno = operacion.substring(0, indiceOperador);
           String numeroDos = operacion.substring(indiceOperador + 1);

           double numero1;
           double numero2;

           try {
               numero1 = Double.parseDouble(numeroUno);
               numero2 = Double.parseDouble(numeroDos);

           } catch (NumberFormatException e) {

                System.out.println(error);
                return;
           }
            

           double resultado = 0.0;
           String nombreOperador = "";

           switch (operador) {
               case "+":
                   resultado = Adiccion(numero1, numero2);
                   nombreOperador = "adiccion";
                   break;
                case "-":
                    resultado = Sustraccion(numero1, numero2);
                    nombreOperador = "sustraccion";
                    break;
                case "*":
                    resultado = producto(numero1, numero2);
                    nombreOperador = "producto";
                    break;
                case "/" : 
                    if (numero2 != 0) {
                        resultado = cociente(numero1, numero2);
                        nombreOperador = "cociente";
                    break;
                    } else {
                        System.out.println(error);
                    }

            
               
           }
           System.out.println(nombreOperador + "  " + resultado);

          
           
           
          }

          input.close();
          
    }

    public static double  Adiccion(double numberOne, double numberTwo) {

        return numberOne+numberTwo;
    }

    public static double Sustraccion(double numberOne, double numberTwo) {

        return  numberOne-numberTwo;
    }

    public static double producto(double numberOne, double numberTwo) {

        return numberOne*numberTwo;
    }

    public static double cociente(double numberOne, double numberTwo) {

        return numberOne/numberTwo;
    }
}
