public class EjemploCinco {
    public static void main(String[] args) {
        
        int resultado = calculadora.sumar(8, 15);
        System.out.println(resultado);
    }
}

class calculadora{

    public static int sumar (int numeroUno, int numeroDos) {
        return numeroUno / numeroDos;
    }
}