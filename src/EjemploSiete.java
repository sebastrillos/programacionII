public class EjemploSiete {
    public static void main(String[] args) {
        
        sumar();
        EjemploSiete nuevo = new EjemploSiete();
        nuevo.restar(12, 5);
    }

    public static void sumar(){
        String sumar = (18+2 == 20)? "es par":"es inpar";
        System.out.println(sumar);
        
    }

    public void restar(int numero, int numeroDos){
        int resta = numero - numeroDos;
        
        System.out.println(resta);
    }

}   
     


